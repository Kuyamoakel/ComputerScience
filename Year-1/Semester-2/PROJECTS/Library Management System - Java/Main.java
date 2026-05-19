import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("1. Add Book\n2. View Book\n3. Search Book\n4. Exit\nEnter Choice: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String bookN = in.nextLine();
                    
                    System.out.print("Enter Author Name: ");
                    String author = in.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = in.nextInt();

                    Book book = new Book(bookN, author, quantity);
                    books.add(book);
                    break;
                case 2:
                    System.out.println("================");

                    for (Book BooK : books) {
                        System.out.println(BooK);
                    }
                    break;
                case 3:
                    boolean isFound = false;
                    int i = 0;
                    Book currentBook = books.get(i);
                    System.out.print("Enter Book Name: ");
                    String searchBook = in.nextLine();

                    for(Book booK : books) {
                        if (booK.getBookName().equalsIgnoreCase(searchBook)) {
                            isFound = true;
                            break;
                        }
                    }

                    if (isFound) {
                        System.out.println("~~ Book Found ~~");
                        System.out.println("Bookname: " + currentBook.getBookName() + "\nAuthor: " + currentBook.getAuthor() + "\nQuantity: " + currentBook.getQuantity());
                    } else {
                        System.out.println("Book not Found!");
                    }
                    break;
                case 4:
                    System.out.println("thank you");
                    return;
                default:
                    System.out.println("INvalid input");
                break;
            }
        }

    }
}