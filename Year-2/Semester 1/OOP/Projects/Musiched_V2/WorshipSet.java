import java.util.UUID;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class WorshipSet {
    private final UUID id;
    private String label;
    private LocalDate date;
    private List<SetSong> songs;

    public WorshipSet(String label, LocalDate date) {
        
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("ERROR: label must not be empty/null");
        }
    
        if (date == null) {
            throw new IllegalArgumentException("ERROR: date must not be empty/null");
        }

        if (LocalDate.now().isAfter(date)) {
            throw new IllegalArgumentException("ERROR: date must not be in the past");
        }
        
        this.id = UUID.randomUUID();
        this.label = label;
        this.date = date;
        this.songs = new ArrayList<>();
    }


    // GETTERS
    public UUID getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<SetSong> getSetSongs() {
        return List.copyOf(songs);
    }

    // SETTERS

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean containsSong(UUID id) {
        for (SetSong song : songs) {
            if (song.getSong().getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeSong(UUID id) {
        for (SetSong song : songs) {
            if (song.getSong().getId().equals(id)) {
                return songs.remove(song);
            }
        }
        return false;
    }

    public void changeSongKey(UUID songId, MusicalKey newKey) {
        for (SetSong song : songs) {
            if (song.getSong().getId().equals(songId)) {
                song.changePerfomarnceKey(newKey);
            }
        }
    }
    // METHODS
    public void addSetSongs(Song song, MusicalKey performanMusicalKey) {
        if (containsSong(song.getId())) {
            throw new IllegalArgumentException(
                "Song Already Exist"
            );
        }
        songs.add(new SetSong(song, performanMusicalKey));
    }

    public void displaySet() {
        System.out.println("------ " + label + " | " + date + " -----");
        for (SetSong song : songs) {
            System.out.println("- " + song.getSong().getTitle() + " by " + song.getSong().getArtist() + " (" + song.getPerformanceKey() + ")");
        }
    }
}