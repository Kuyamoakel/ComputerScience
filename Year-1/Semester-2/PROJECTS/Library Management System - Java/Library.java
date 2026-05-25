import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addBook(String bookName, String author, int quantity) {
        boolean isExist = false;

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                isExist = true;
            }
        }
        if (isExist) {
            System.out.println("~~~ Book Already Exist ~~~");
            return;
        }

        System.out.println("~~~ Book Added ~~~");
        Book AddBook = new Book(bookName, author, quantity);
        books.add(AddBook);
    }

    public void viewBooks() {
        if (books.size() == 0) {
            System.out.println("\n~~~ NO BOOKS AVAILABLE YET ~~~");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBook(String bookId) {
        boolean isFound = false;
        int i = 0;

        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(bookId)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println(books.get(i));
        } else {
            System.out.println("~~~ BOOK NOT FOUND ~~~");
        }
    }

    public void deleteBook(String bookId) {

        if (books.size() == 0) {
            System.out.println("\n~~~ NO BOOKS AVAILABLE YET ~~~");
            return;
        }

        int i = containsIndexBook(bookId);
        Book currentBook = books.get(i);

        if (i != -1) {
            System.out.println("\n" + books.get(i));
            while (true) {
                System.out.print("\nAre you sure you want to delete it ? (y/n): ");
                String yesNo = in.nextLine();
                if (yesNo.equalsIgnoreCase("y")) {
                    books.remove(i);
                    System.out.println("\n" + currentBook.getBookName() + " Has been removed from the library!");
                    return;
                } else if (yesNo.equalsIgnoreCase("n")) {
                    System.out.println("~~~ Alright Thank you ~~~");
                    return;
                } else {
                    System.out.println("\n~~~ Invalid Input ~~~");
                    continue;
                }
            }
        } else {
            System.out.println("~~~ NAME NOT FOUND ~~~");
        }
    }

    public void updateBook(String bookID) {

        if (books.size() == 0) {
            System.out.println("\n~~~ NO BOOKS AVAILABLE YET ~~~");
            return;
        }
        
        int i = containsIndexBook(bookID);

        Book currentBook = books.get(i);

        if (i != -1) {
            System.out.print("Enter Quantity: ");
            int newQuantity = in.nextInt();
            in.nextLine();

            if (newQuantity <= currentBook.getQuantity()) {
                System.out.println("Bro? You are restocking, New quantity must be Higher!");
                return;
            }

            currentBook.setQuantity(newQuantity);
            System.out.println("~~~ SUCCESFUllY RESTOCK ~~~");
        } else {
            System.out.println("~~~ BOOK NOT FOUND ~~~");
        }
    }

    public int containsIndexBook(String bookId) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(bookId)) {
                return i;
            }
        }
        return -1;
    }
}
