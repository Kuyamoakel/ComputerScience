class Book {
    private static int counter = 1000;
    private String id;
    private String bookName;
    private String author;
    private int quantity;
    private int availableQuantity;
    private boolean borrow = false;

    public Book (String bookName, String author, int quantity) {
        this.id = "AK" + counter++; 
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.availableQuantity = quantity;
    }
    
    // getters
    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getBorrow() {
        if (availableQuantity > 0) {
            availableQuantity--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        if (availableQuantity < quantity) {
            availableQuantity++;
        }
    }

    // Setters
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                " | Book name: " + bookName +
                " | Author: " + author +
                " | Available: " + availableQuantity + "/" + quantity;
    }
}