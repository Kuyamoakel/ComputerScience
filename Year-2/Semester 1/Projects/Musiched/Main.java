import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instrumentList1 = new ArrayList<>();
        List<Instrument> instrumentList2 = new ArrayList<>();
        List<Chord> GoodnessChords = new ArrayList<>();
        List<Chord> ManghaChords = new ArrayList<>();
        List<Song> songs = new ArrayList<>();
        List<Musician> musicians = new ArrayList<>();
        List<WorshipSet> setLibrays = new ArrayList<>();

        instrumentList1.add(new Instrument("Piano", "Keyboard"));
        instrumentList1.add(new Instrument("Guitar", "Electric Guitar"));

        instrumentList2.add(new Instrument("Bass", "Eletric Bass Guitar"));
        instrumentList2.add(new Instrument("Piano", "Keyboard"));

        Musician musician1 = new Musician("Akel", 20, instrumentList1);
        
        Musician musician2 = new Musician("Shei", 34, instrumentList2);

        musicians.add(musician1);
        musicians.add(musician2);

        Chord GoodnessStanza = new Chord("Stanza: \nI - IV - I - V/VII\nvi - IV - V");
        Chord GoodnessChorus = new Chord("vi - IV - I - V/VII\nvi - IV - V - I");

        Chord ManghaIntro = new Chord("Intro: \nvi - V - I - IV \nvi - V - IV");
        Chord ManghaStanza = new Chord("\nStanza: \nI - vi - IV (2x)");
        Chord ManghaPre = new Chord(
            "\nPre-Cho: \nvi - V - I - IV \nii - I/III - IV" + 
            "vi - V - I - IV \\nii - I/III - V"
        );

        GoodnessChords.add(GoodnessStanza);
        GoodnessChords.add(GoodnessChorus);
        ManghaChords.add(ManghaIntro);
        ManghaChords.add(ManghaStanza);
        ManghaChords.add(ManghaPre);

        Song song1 = new Song("Goodness of God", "Jenn Johnson", MusicalKey.G_FLAT, GoodnessChords);
        Song song2 = new Song("Mangha", "His Life Worship", MusicalKey.A, ManghaChords);

        songs.add(song1);
        songs.add(song2);

        WorshipSet set1 = new WorshipSet("Paranique", LocalDate.of(2026, 8, 26), songs, musicians);
        WorshipSet set2 = new WorshipSet("Paranique", LocalDate.of(2026, 8, 26), songs, musicians);

        musicians.clear();
        GoodnessChords.clear();
        ManghaChords.clear();
        songs.clear();

        setLibrays.add(set1);
        setLibrays.add(set2);
    
        SetLibrary setnum1 = new SetLibrary("October Praise", setLibrays);
        SetLibrary setnum2 = new SetLibrary("October Praise", setLibrays);

        setLibrays.clear();

        System.out.println(setnum1);
        System.out.println(setnum2);

    }
}