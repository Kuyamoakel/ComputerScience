import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

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
        for (Map.Entry<UUID, Song> entry : songs.entrySet()) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songs.values()); 
    }

    @Override
    public boolean deleteById(UUID id) {

        for (Map.Entry<UUID, Song> entry : songs.entrySet()) {
            if (entry.getKey().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
}