public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: $" + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Book book1 = new Book("Bible", "...", 1200);
        Book book2 = new Book("Atomic Habit", "Almozara", 400);
        Book book3 = new Book("Art of Laziness", "Alfred", 600);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        
    }
}