public class SetSong {
    private final Song song;
    private MusicalKey performanceKey;

    public SetSong(Song song, MusicalKey performanceKey) {
        if (song == null) {
            throw new IllegalArgumentException("ERROR: Song must not be empty/null");
        }

        if (performanceKey == null) {
            throw new IllegalArgumentException("ERROR: Key must not be empty/null");
        }

        this.song = song;
        this.performanceKey = performanceKey;
    }

    public Song getSong() {
        return song;
    }

    public String getPerformanceKey() {
        return performanceKey.getDescription();
    }

    public void changePerfomarnceKey(MusicalKey newKey) {

        if (newKey == null) {
            throw new IllegalArgumentException("ERROR: Key must not be empty/null");
        }

        this.performanceKey = newKey;
    }    

    public void displaySetSong() {
        getSong().displayInfo();
        System.out.println("-------------");
        System.out.println(getPerformanceKey());
    }
}
