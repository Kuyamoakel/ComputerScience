class Book {
    private String bookName;
    private String author;
    private int quantity;

    public Book (String bookName, String author, int quantity) {
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }

    // getters
    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book name: " + bookName +
                ", Author: " + author +
                ", Quantity: " + quantity;
    }
}