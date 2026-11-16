import java.util.UUID;
import java.util.List;

public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {

        // constraint
        if (songRepository == null) {
            throw new IllegalArgumentException(
                "Repository cannot be null"
            );
        }

        this.songRepository = songRepository;
    }

    public Song getSong(UUID id) {
        return songRepository.findById(id);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public boolean removeSong(UUID id) {
        return songRepository.deleteById(id);
    }

    // public boolean deleteById(UUID id) {
    //     return songs.remove(id) != null;
    // }
    // 
    public Song registerSong(
        String title,
        String artist,
        MusicalKey defaultKey
    ) {

        for (Song song : songRepository.findAll()) {
            if (song.getTitle().equals(title) && song.getArtist().equals(artist)) {
                throw new IllegalArgumentException(
                    "Song Already Exist!"
                );
            }
        }

        Song song = new Song(title, artist, defaultKey);
        songRepository.save(song);

        return song;
    }


}
