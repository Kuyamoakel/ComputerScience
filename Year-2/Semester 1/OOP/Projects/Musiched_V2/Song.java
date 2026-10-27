import java.util.UUID;

public class Song {
    private final UUID id;
    private String title;
    private String artist;
    private MusicalKey defaultKey;

    public Song(String title, String artist, MusicalKey defaultKey) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("ERROR: Title must not be empty/null");
        }

        if (artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("ERROR: Artist must not be empty/null");
        }

        if (defaultKey == null) {
            throw new IllegalArgumentException("ERROR: Key must not be empty/null");
        }

        this.id = UUID.randomUUID();
        this.title = title;
        this.artist = artist;
        this.defaultKey = defaultKey;
    }

    // getters
    public UUID getId() {return id;}

    public String getTitle() {return title;}

    public String getArtist() {return artist;}

    public String getDefaultKey() {return defaultKey.getDescription();}
    
    // setters
    public void setTitle(String title) {
        if (title.isBlank() || title == null) {
            throw new IllegalArgumentException("ERROR: Title must not be empty/null");
        }

        this.title = title;
    }

    public void setArtist(String artist) {
        if (artist.isBlank() || artist == null) {
            throw new IllegalArgumentException("ERROR: Artist must not be empty/null");
        }
        this.artist = artist;
    }

    public void setDefaultKey(MusicalKey defaultKey) {
        if (defaultKey == null) {
            throw new IllegalArgumentException("ERROR: Key must not be empty/null");
        }
        this.defaultKey = defaultKey;
    }
    
    public void displayInfo() {
        System.out.println(title + " by " + artist + " (" + defaultKey.getDescription() + ")");
    }
    
}