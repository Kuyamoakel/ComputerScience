public class BookBorrowing {
    Records record;
    Library libray;

    public BookBorrowing(Records record, Library library) {
        this.record = record;
        this.libray = library;
    }

    public void borrowBook(String bookId, int quantity, String memberId) {

        if (isMember(memberId)) {
            int i = 0;
            boolean isFound = false;

            for (i = 0; i < libray.books.size(); i++) {
                if (libray.books.get(i).getId().equalsIgnoreCase(bookId)) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                if (quantity > libray.books.get(i).getQuantity()) {
                    System.out.println("That's over the stock of the library!");
                    return;
                } else {
                    int newQuantity = libray.books.get(i).getQuantity() - quantity;

                    libray.books.get(i).setQuantity(newQuantity);
                }
            }
        } else {
            System.out.println("You are not a Member!");
        }

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
