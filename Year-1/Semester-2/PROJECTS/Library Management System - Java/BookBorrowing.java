public class BookBorrowing {
    Records record;
    Library libray;

    public BookBorrowing(Records record, Library library) {
        this.record = record;
        this.libray = library;
    }

    public void borrowBook(String bookId, int quantity, String memberId) {
        int i = 0;
        Book currentBook = libray.books.get(i);


        for (i = 0; i < libray.books.size(); i++) {
            if (libray.books.get(i).getId().equalsIgnoreCase(memberId)) {
                break;
            }
        }

        if (quantity == 0) {
            System.out.println("Please put proper value on it.");
            return;
        }

        if (quantity > currentBook.getQuantity()) {
            System.out.println("That is more than our Stock");
            return;
        }   
    }

    public boolean bookFind(String bookId) {
        boolean isBookFound = false;

        for (int i = 0; i < libray.books.size(); i++) {
            if (libray.books.get(i).getId().equalsIgnoreCase(bookId)) {
                System.out.println("-----------------------------------------------------------");
                System.out.println(libray.books.get(i));
                System.out.println("-----------------------------------------------------------");
                return isBookFound = true;
            }
        }
        return isBookFound;

    }

    public boolean isMember(String memberId) {
        boolean isMember = false;

        for (int i = 0; i < record.members.size(); i++) {
            if (record.members.get(i).getId().equalsIgnoreCase(memberId)) {
                isMember = true;
                break;
            }
        }
        return isMember;
    }
}
