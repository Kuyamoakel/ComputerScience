import java.util.Scanner;

public class Main {
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        Records record = new Records();

        while (true) {
            System.out.print(COLOR_YELLOW+ "\n===== AKERU'S LIBRARY =====" + COLOR_RESET +"\n1. Add Book\n2. View Book\n3. Search Book\n4. Delete\n5. Restock Book\n6. MemberShip\nEnter Choice: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    header("ADDING BOOK");
                    System.out.print("Enter Book Name: ");
                    String bookN = in.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = in.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = in.nextInt();
                    in.nextLine();

                    library.addBook(bookN, author, quantity);

                    break;
                case 2:
                    header("LIST OF BOOKS");
                    library.viewBooks();
                    break;
                case 3:
                    header("SEARCHING BOOK");
                    System.out.print("Enter ID: ");
                    String searchingBook = in.nextLine();

                    library.searchBook(searchingBook);
                    break;
                case 4:
                    header("DELETING BOOK");
                    System.out.print("Enter ID: ");
                    String bookDelete = in.nextLine();

                    library.deleteBook(bookDelete);
                    break;
                case 5:
                    header("UPDATE BOOK");
                    System.out.print("Enter ID: ");
                    String bookUpdate = in.nextLine();

                    library.updateBook(bookUpdate);

                    break;
                case 6:
                    header("MEMBERSHIP");
                    System.out.print("Enter Name: ");
                    String memberName = in.nextLine();

                    System.out.print("Enter Occupation: ");
                    String memberOccupation = in.nextLine();

                    record.register(memberName, memberOccupation);
                    break;
                default:
                    System.out.println("INvalid input");
                    break;
            }
        }
    }
    public static void header(String header) {
        System.out.println(COLOR_YELLOW + "===== " + header + " =====" + COLOR_RESET);
    }
}