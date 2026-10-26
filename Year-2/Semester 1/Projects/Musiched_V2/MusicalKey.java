public enum MusicalKey {
    A("A"), A_Sharp("A#"),
    B_Flat("Bb"), B("B"),
    C("C"), C_Sharp("C#"),
    D_Flat("Db"), D("D"),
    D_Sharp("D#"), E_Flat("Eb"),
    E("E"), F("F"),
    F_Sharp("F#"), G_Flat("Gb"),
    G("G"), G_Sharp("G#"),
    A_Flat("Ab");

    private final String DESCRIPTION;

    MusicalKey(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}