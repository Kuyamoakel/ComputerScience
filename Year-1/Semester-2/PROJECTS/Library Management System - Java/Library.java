import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addBook(String bookName, String author, int quantity) {
        boolean isExist = false;

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("~~~ Book Already Exist ~~~");
                isExist = true;
            }
        }
        if (isExist) {
            System.out.println("Book Already Exist!");
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

    public void searchBook(String bookname) {
        boolean isFound = false;
        int i = 0;

        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().equalsIgnoreCase(bookname)) {
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

    public void deleteBook(String bookname) {
        boolean isFound = false;
        int i = 0;

        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().equalsIgnoreCase(bookname)) {
                isFound = true;
                break;
            }
        }

        Book currentBook = books.get(i);

        if (isFound) {
            System.out.println("\n" + books.get(i));

            System.out.print("\nAre you sure that you to delelete it ? (y/n): ");
            String yesNo = in.nextLine();

            if (yesNo.equalsIgnoreCase("y")) {
                books.remove(i);
                System.out.println("\n" + currentBook.getBookName() + " Is removed to library!");
                return;
            } else if (yesNo.equalsIgnoreCase("n")) {
                System.out.println("~~~ Alright Thank you ~~~");
                return;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    public void updateBook() {
        boolean isFound = false;
        int i = 0;

        if (books.size() == 0) {
            System.out.println("\n~~~ NO BOOKS AVAILABLE YET ~~~");
            return;
        }

        System.out.print("Enter Book Name: ");
        String bookUpdate = in.nextLine();

        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().equalsIgnoreCase(bookUpdate)) {
                isFound = true;
                break;
            }
        }

        Book currentBook = books.get(i);

        if (isFound) {
            System.out.print("Enter Quantity: ");
            int newQuantity = in.nextInt();
            in.nextLine();

            if (newQuantity < currentBook.getQuantity()) {
                System.out.println("Bro? You are restocking, New quantity must be Higher!");
                return;
            }

            currentBook.setQuantity(newQuantity);
            System.out.println("~~~ SUCCESFUllY RESTOCK ~~~");
        } else {
            System.out.println("~~~ BOOK NOT FOUND ~~~");
        }
    }
}
