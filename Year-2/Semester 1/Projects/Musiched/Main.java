import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Lists
        List<Song> songs = new ArrayList<>();

        // Array
        MusicalKey[] keys = MusicalKey.values();

        while (true) {
            try {

                System.out.print(
                    "----- Worship Library ----\n" +
                    "1. Add song\n" +
                    "2. Add musician\n" +
                    "3. Build a worship set\n" +
                    "4. View Library\n" +
                    "5. Exit\n" +
                    "Choice: "
                );
                int menu = input.nextInt();
                input.nextLine();

                switch (menu) {
                    case 1:
                        List<Chord> chords = new ArrayList<>();
                        System.out.println("--- Adding Songs ---");

                        System.out.print("Enter Title: ");
                        String title = input.nextLine();

                        System.out.print("Enter Artist: ");
                        String artist = input.nextLine();

                        System.out.println("Select Key: ");
                        for(int i = 0; i < keys.length; i++) {
                            System.out.println((i+1) + ". " + keys[i]);
                        }

                        System.out.print("Choice: ");
                        int keyChoice = input.nextInt();
                        input.nextLine();

                        MusicalKey selectedKey = keys[keyChoice - 1];

                        System.out.println("Add Chords and Label to it (Stanza, Pre, Chorus):");
                        boolean decision;
                        do {
                            System.out.print("Enter chord: ");
                            String chord = input.nextLine();

                            Chord songChord = new Chord(chord);
                            chords.add(songChord);

                            System.out.print("Do you want to continue? (Y / N): ");
                            String continuing = input.nextLine().toLowerCase();
                            
                            decision = (continuing.equals("y"));
                            
                        } while (decision);

                        Song newSong = new Song(title, artist, selectedKey, chords);
                        songs.add(newSong);
                        System.out.println("Song Added\n");
                        break;
                    case 5:
                        System.out.println("Exiting Program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try Again.\n");
                        break;
                }

            } catch (InputMismatchException | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.out.println("Invalid Input. Please try again! (Press enter)");
                input.nextLine();
            }
        }
    }
}