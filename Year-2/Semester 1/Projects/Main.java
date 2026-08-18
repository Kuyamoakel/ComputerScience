import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instrumentList = new ArrayList<>();
        List<Chord> chordProgression = new ArrayList<>();
        
        Instrument piano = new Instrument("Piano", "Keyboard");
        Instrument guitar = new Instrument("Guitar", "Electric Guitar");

        instrumentList.add(piano);
        instrumentList.add(guitar);

        Musician akel = new Musician("Akel", 20, instrumentList);

        // System.out.println(akel.getName() + " Plays \n" + akel.getInstrument());

        Chord chord = new Chord("vi - V - I - IV\nvi - V - IV");

        chordProgression.add(chord);

        

        Song song1 = new Song(null, "Jenn Johnson", MusicalKey.G_FLAT, chordProgression);
        Song song2 = new Song("Mangha", "His Life Worship", MusicalKey.A, chordProgression);

        System.out.println(song1);
        System.out.println(song2);
    }
}