public class Chord {
    String nashville;

    public Chord(String nashville) {

        if (nashville == null || nashville.isBlank()) {
            throw new IllegalArgumentException("Nashville must not be empty!");
        }

        this.nashville = nashville;
    }

    // Getters
    public String getNashville() {
        return nashville;
    }

    // Setters
    public void setNashville(String nashville) {

        if (nashville == null || nashville.isBlank()) {
            throw new IllegalArgumentException("Nashville must not be empty!");
        }

        this.nashville = nashville;
    }

    @Override
    public String toString() {
        return "Chords: " + nashville;
    }
}
