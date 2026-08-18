import java.util.List;

enum MusicalKey {
    C("C"), C_SHARP("C#"), D_FLAT("Db"), D("D"),
    D_SHARP("D#"), E_FLAT("Eb"), E("E"), F("F"),
    F_SHARP("F#"), G_FLAT("Gb"), G("G"), G_SHARP("G#"),
    A_FLAT("Ab"), A("A"), A_SHARP("A#"), B_FLAT("Bb"), 
    B("B");

    private final String label;

    // Setter
    MusicalKey(String label) {
        this.label = label;   
    }

    @Override
    public String toString() {
        return label;
    }

}

public class Song {
    private String title;
    private String artist;
    private MusicalKey key;
    private List<Chord> chord;

    public Song (String title, String artist, MusicalKey key, List<Chord> chord) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must not be empt!");
        }

        if (artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Artist must not be empt!");
        }

        if (key == null) {
            throw new IllegalArgumentException("Key must not be null!");
        }

        if (chord == null) {
            throw new IllegalArgumentException("Chord must not be empty!");
        }

        this.title = title;
        this.artist = artist;
        this.key = key;
        this.chord = chord;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public MusicalKey getKey() {
        return key;
    }

    public List<Chord> getChord() {
        return chord;
    }

    // Setters
    public void setTitle(String title) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must not be empt!");
        }
        this.title = title;
    }

    public void setArtist(String artist) {

        if (artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Artist must not be empt!");
        }
        this.artist = artist;
    }

    public void setKey(MusicalKey key) {

        if (key == null) {
            throw new IllegalArgumentException("Key must not be null!");
        }

        this.key = key;
    }

    public void setChord(List<Chord> chord) {

        if (chord == null) {
            throw new IllegalArgumentException("Chord must not be empty!");
        }

        this.chord = chord;
    }

    @Override
    public String toString() {
        return "Songs" + "\n-----------" + "\n" +
               "Title: " + title + "\n" +
               "Artist: " + artist +  "\n" +
               "Key: " + key + "\n" +
               "Chords: " + chord;
    }

}