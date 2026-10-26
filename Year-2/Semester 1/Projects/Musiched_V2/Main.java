import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        List<Song> songs = new ArrayList<>();

        Song song1 = new Song("Goodness Of God", "Bethel Music", MusicalKey.C);
        Song song2 = new Song("Living Hope", "Phil Wickham", MusicalKey.G);

        song1.displayInfo();

        WorshipSet sundaySet = new WorshipSet("Sunday Set", LocalDate.of(2026, 10, 30));
        WorshipSet youthSet = new WorshipSet("Youth Set", LocalDate.of(2026, 10, 31));

        sundaySet.addSetSongs(song1, MusicalKey.A);
        youthSet.addSetSongs(song2, MusicalKey.F);

        sundaySet.displaySet();

        youthSet.displaySet();
    }
}