import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instrumentList = new ArrayList<>();
        List<Chord> chordProgression = new ArrayList<>();
        List<Song> songs = new ArrayList<>();
        List<Musician> musicians = new ArrayList<>();
        
        Instrument piano = new Instrument("Piano", "Keyboard");
        Instrument guitar = new Instrument("Guitar", "Electric Guitar");
        Instrument bass = new Instrument("Bass", "Electric Bass");
        Instrument drums = new Instrument("Drums", "Electric Drums");

        instrumentList.add(piano);
        instrumentList.add(guitar);

        Musician musician1 = new Musician("Akel", 20, List.of(
            new Instrument("Piano", "Keyboard"),
            new Instrument("Guitar", "Electric Guitar")
        ));
        
        Musician musician2 = new Musician("Shei", 34, List.of(
            new Instrument("Bass", "Eletric Bass Guitar"),
            new Instrument("Piano", "Keyboard")
        ));

        musicians.add(musician1);
        musicians.add(musician2);

        Chord chord = new Chord("vi - V - I - IV\nvi - V - IV");
        chordProgression.add(chord);

        Song song1 = new Song("Goodness of God", "Jenn Johnson", MusicalKey.G_FLAT, List.of(
            new Chord("Stanza: \nI - IV - I - V/VII\nvi - IV - V"),
            new Chord("vi - IV - I - V/VII\nvi - IV - V - I")

        ));
        Song song2 = new Song("Mangha", "His Life Worship", MusicalKey.A, List.of(
            new Chord("Intro: \nvi - V - I - IV \nvi - V - IV"),
            new Chord("\nStanza: \nI - vi - IV (2x)"),
            new Chord("\nPre-Cho: \nvi - V - I - IV \nii - I/III - IV"),
            new Chord("vi - V - I - IV \nii - I/III - V")
        ));

        songs.add(song1);
        songs.add(song2);

        WorshipSet set1 = new WorshipSet("Paranique", LocalDate.of(2026, 8, 21), songs, musicians);

        musicians.clear();
        instrumentList.clear();
        songs.clear();
        chordProgression.clear();

        System.out.println(set1);


    }
}