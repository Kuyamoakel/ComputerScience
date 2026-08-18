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

        Musician musician1 = new Musician("Akel", 20, instrumentList);
        Musician musician2 = new Musician("Arsy", 19, instrumentList);

        musicians.add(musician1);
        musicians.add(musician2);

        Chord chord = new Chord("vi - V - I - IV\nvi - V - IV");
        chordProgression.add(chord);

        Song song1 = new Song("Goodness of God", "Jenn Johnson", MusicalKey.G_FLAT, chordProgression);
        Song song2 = new Song("Mangha", "His Life Worship", MusicalKey.A, chordProgression);

        songs.add(song1);
        songs.add(song2);

        WorshipSet set1 = new WorshipSet("Lipa", LocalDate.of(2026, 8, 18), songs, musicians);

        System.out.println(set1);


    }
}