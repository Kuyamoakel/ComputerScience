import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.print(
                    "\n===== AKERU'S LIBRARY =====\n1. Add Book\n2. View Book\n3. Search Book\n4. Delete\n5. Restock Book\nEnter Choice: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n~~~ ADDING BOOKS ~~~");
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
                    System.out.println("\n===== LIST OF BOOKS =====");
                    library.viewBooks();
                    break;
                case 3:
                    System.out.println("\n===== SEARCHING BOOK =====");
                    System.out.print("Enter ID: ");
                    String searchingBook = in.nextLine();

                    library.searchBook(searchingBook);
                    break;
                case 4:
                    System.out.println("\n===== DELETING BOOK =====");
                    System.out.print("Enter ID: ");
                    String bookDelete = in.nextLine();

                    library.deleteBook(bookDelete);
                    break;
                case 5:
                    System.out.println("\n===== UPDATE BOOK =====");
                    System.out.print("Enter ID: ");
                    String bookUpdate = in.nextLine();

                    library.updateBook(bookUpdate);

                    break;
                default:
                    System.out.println("INvalid input");
                    break;
            }
        }

    }
}