import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InMemorySongRepository implements SongRepository {

    private final Map<UUID, Song> songs = new HashMap<>();


    @Override 
    public void save(Song song) {
        if (song == null) {
            System.out.println("No Song Found!");
            return;
        }
        songs.put(song.getId(), song);
    }

    @Override 
    public Song findById(UUID id) {
        return songs.get(id);
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songs.values()); 
    }

    @Override
    public boolean deleteById(UUID id) {
        return songs.remove(id) != null;
    }
    
}