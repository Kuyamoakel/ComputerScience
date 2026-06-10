abstract class Library {
    String title;
    String author;

    Library(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void borrowItem();

    void borrowReceipt() {
        System.out.println("Successfully Borrowed!");
    }
}

class Book extends Library {

    Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void borrowItem() {
        System.out.println("Title: " + title + "\nAuthor: " + author);
    }
}

class Magazine extends Library {

    Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void borrowItem() {
        System.out.println("Title: " + title + "\nAuthor: " + author);
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

        for (Library libray : librarys) {
            libray.borrowItem();
            libray.borrowReceipt();
            System.out.println();
        }

    }
}