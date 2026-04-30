import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("===== NOTES =====\n[1] New Notes\n[2] View Notes\n[3] Exit\nChoces: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter new Notes: ");
                    String task = in.nextLine();

                    FileWriter writer = new FileWriter("Task.txt", true);
                    writer.write(task + "\n");
                    writer.close();
                    System.out.println("Succesfully Added!");
                    break;
                case 2:
                    // View notes
                    File file = new File("Task.txt");

                    if (!file.exists()) {
                        System.out.println("No notes yet!");
                        continue;
                    }

                    Scanner reader = new Scanner(file);
                    System.out.println("\nYour Notes");

                    while (reader.hasNextLine()) {
                        System.out.println(" - " + reader.nextLine());
                    }
                    reader.close();
                    break;
                case 3:
                    System.out.println("Thank you so much!");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}