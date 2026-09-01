import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Lists
        List<Song> songs = new ArrayList<>();
        List<Musician> musicians = new ArrayList<>();

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
                                "Choice: ");
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
                        for (int i = 0; i < keys.length; i++) {
                            System.out.println((i + 1) + ". " + keys[i]);
                        }

                        System.out.print("Choice: ");
                        int keyChoice = input.nextInt();
                        input.nextLine();

                        MusicalKey selectedKey = keys[keyChoice - 1];

                        System.out.println("Add Chords and Label it (Stanza, Pre, Chorus):");
                        boolean chordLoop = false;
                        do {
                            System.out.print("Enter chord: ");
                            String chord = input.nextLine();

                            Chord songChord = new Chord(chord);
                            chords.add(songChord);

                            System.out.print("Do you want to continue? (Y / N): ");
                            String continuing = input.nextLine().toLowerCase();

                            chordLoop = (continuing.equals("y"));

                        } while (chordLoop);

                        System.out.print("\nConfirmend (Y/N): ");
                        String confirmationCaseOne = input.nextLine();

                        if (confirmationCaseOne.equalsIgnoreCase("y")) {
                            Song newSong = new Song(title, artist, selectedKey, chords);
                            songs.add(newSong);
                            System.out.println("Song Added\n");
                        } else if (confirmationCaseOne.equalsIgnoreCase("n")) {
                            System.out.println("Canceled!");
                            break;
                        } else {
                            System.out.println("Invalid Input");
                            break;
                        }
                        break;
                    case 2:
                        List<Instrument> instruments = new ArrayList<>();
                        System.out.println("--- Adding Musicians ---");

                        System.out.print("Enter Name: ");
                        String name = input.nextLine();

                        System.out.print("Enter Age: ");
                        int age = input.nextInt();
                        input.nextLine();
                        System.out.println("--- Insert your Instruments ---");

                        boolean instrumentLoop = false;
                        do {
                            System.out.print("Instrument Name: ");
                            String instrumentName = input.nextLine();

                            System.out.print("Instrument Type: ");
                            String instrumentType = input.nextLine();

                            if (instrumentName.equalsIgnoreCase(instrumentType)) {
                                System.out.println("Error! Try again... must not be same name!");
                                instrumentLoop = true;
                            } else {
                                Instrument musicInstrument = new Instrument(instrumentName, instrumentType);
                                instruments.add(musicInstrument);
                                System.out.print("Add more? (Y/N): ");
                                String continuing = input.nextLine().toLowerCase();
                                instrumentLoop = (continuing.equals("y"));
                            }

                        } while (instrumentLoop);

                        System.out.print("\nConfirmend (Y/N): ");
                        String confirmationCaseTwo = input.nextLine();

                        if (confirmationCaseTwo.equalsIgnoreCase("y")) {
                            Musician newMusician = new Musician(name, age, instruments);
                            musicians.add(newMusician);
                            System.out.println("Musician Added!\n");
                        } else if (confirmationCaseTwo.equalsIgnoreCase("n")) {
                            System.out.println("Canceled!");
                            break;
                        } else {
                            System.out.println("Invalid Input");
                            break;
                        }
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