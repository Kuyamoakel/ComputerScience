abstract class Library {
    String title;
    String author;

    Library(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void borrowItem();

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    void bookReceipt() {
        System.out.println("Succesfully Borrow!");
    }


}

class Book extends Library {

    Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowing Book...");
    }
}

class Magazine extends Library {

    Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowing Book...");
    }
}

public class LibraryResource {
    public static void main(String[] args) {

        Library[] librarys = {
            new Book("Atomic Habit", "James Clear"),
            new Book("Be uncommon", "Warren Buffet"),
            new Book("Be a Leader", "Augustine Clark"),
            new Magazine("Bible", "God")

        };

        for (Library library : librarys) {
            library.borrowItem();
            library.displayDetails();
            library.bookReceipt();
            System.out.println();
        }

    }
}