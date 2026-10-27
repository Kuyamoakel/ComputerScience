import java.util.UUID;
import java.util.List;

public interface SongRepository {
    // contracts
    void save(Song song);
    Song findById(UUID id);
    List<Song> findAll();
    boolean deleteById(UUID id);
}