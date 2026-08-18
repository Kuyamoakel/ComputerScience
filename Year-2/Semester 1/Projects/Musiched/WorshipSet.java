import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class WorshipSet {
    private String label;
    private LocalDate date;
    private List<Song> songs;
    private List<Musician> musicians;

    public WorshipSet(String label, LocalDate date, List<Song> songs, List<Musician> musicians) {

        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Label cannot be empty!");
        }

        if (date == null || LocalDate.now().isAfter(date)) {
            throw new IllegalArgumentException("Date cannot be in the past!");
        }

        if (songs == null || songs.isEmpty()) {
            throw new IllegalArgumentException("Song must have 1 atleast!");
        }

        if (musicians == null) {
            throw new IllegalArgumentException("Musician must not be null!");
        }

        this.label = label;
        this.date = date;
        this.songs = songs;
        this.musicians = new ArrayList<>(musicians);
    }

    public void addMusician(Musician musician) {

        if (musician == null) {
            throw new IllegalArgumentException("Musician must have not be null!");
        }

        musicians.add(musician);
    }

    public void addSong(Song song) {

        if (song == null) {
            throw new IllegalArgumentException("Song must have 1 atleast!");
        }

        songs.add(song);
    }

    public boolean removeSong(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Song name must not be empty!");
        }

        if (songs.isEmpty()) {
            return false;
        }   

        return songs.removeIf(song -> song.getTitle().equalsIgnoreCase(name));
    }

    public int totalSongs() {
        
        if (songs.isEmpty()) {
            return 0;
        }

        return songs.size();
    }

    public String getLabel() {
        return label;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Song> getSongs() {
        return List.copyOf(songs);
    }

    public List<Musician> getMusicians() {
        return List.copyOf(musicians);
    }

    // Setters
    public void setLabel(String label) {

        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Label cannot be empty!");
        }

        this.label = label;
    }

    public void setDate(LocalDate date) {

        if (date == null || LocalDate.now().isAfter(date)) {
            throw new IllegalArgumentException("Date cannot be in the past!");
        }

        this.date = date;
    }

    public void setSongs(List<Song> songs) {

        if (songs == null || songs.isEmpty()) {
            throw new IllegalArgumentException("Song must have 1 atleast!");
        }

        this.songs = new ArrayList<>(songs);
    }

    public void setMusicians(List<Musician> musicians) {

        if (musicians == null) {
            throw new IllegalArgumentException("Musician must not be null!");
        }

        this.musicians = new ArrayList<>(musicians);
    }


    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        sb.append("Label: " + label);
        sb.append("\nDate: " + date);
        sb.append("\nSongs:\n");

        for (int i = 0; i < songs.size(); i++) {
            sb.append((i+1) + ". ").append(songs.get(i)).append("\n\n");
        }

        sb.append("Musicians: ");

        for (Musician musician : musicians) {
            sb.append(musician + "\n");
        }

        return sb.toString();
    }
}
