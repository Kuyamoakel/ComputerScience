import java.util.Scanner;

public class Almozara_ArrayProgram {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] bookName = new String[30];
        int[] bookQuantity = new int[30];
        int storageCount = 0;
        
        Login();

        while (true) {
            System.out.print("\n~~ Akel's Library ~~\n[1] Add\n[2] Update\n[3] Delete\n[4] View\n[5] Exit\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n~~~ ADDING BOOKS ~~~");
                    System.out.print("Enter the name of the Book: ");
                    String booksName = in.nextLine();

                    System.out.print("Enter how many the Book: ");
                    int booksQuantity = in.nextInt();
                    in.nextLine();

                    if (booksName.isEmpty()) {
                        System.out.println("ERROR: You must put name to it!");
                        break;
                    }
                    if (booksQuantity >= 11) {
                        System.out.println("ERROR: No more greater than 10");
                        break;
                    }
                    if (storageCount == 30) {
                        System.out.println("ERROR: Sorry The Library is Full!");
                        break;
                    }
                    storageCount = Adding(booksName, booksQuantity, bookName, bookQuantity, storageCount);
                    System.out.println("Succesfully Added!");
                    break;
                case 2:
                    System.out.println("\n~~~ UPDATING BOOKS ~~~");
                    System.out.print("Enter the number of the book to update: ");
                    int numberUpdate = in.nextInt();
                    in.nextLine();

                    if (numberUpdate <= 0 ||numberUpdate > storageCount) {
                        System.out.println("ERROR: There's no Book in there!");
                        break;
                    }
                    if (numberUpdate > 30) {
                        System.out.println("ERROR: Akel's Library Only have the capacity for 30 books");
                        break;
                    }

                    Update(numberUpdate, bookName, bookQuantity);
                    break;
                case 3:
                    System.out.println("===== DELETING BOOKS =====");
                    System.out.print("Enter the number of the book to delete: ");
                    int bookToDelete = in.nextInt();

                    if (bookToDelete <= 0 || bookToDelete > storageCount) {
                        System.out.println("ERROR: There's no book to delete.");
                        break;
                    }

                    storageCount = Delete(bookToDelete, bookName, bookQuantity, storageCount);

                    System.out.println("Succesfully Deleted!");
                    break;
                case 4:
                    System.out.println("===== LIST OF THE BOOKS AVAILABLE =====");
                    for (int i = 0; i < storageCount; i++) {
                        if (bookName[i] != null) {
                            System.out.println((i+1) +". "+ bookName[i] + " - " + bookQuantity[i] + "pcs");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you so much for coming to Akel's Library!");
                    return;
                default:
                    System.out.println("ERROR: Invalid Input Please Try Again!");
                    break;
            }
        }

    }

    public static int Adding(String booksName, int booksQuantity, String[] bookname, int[] bookQuantity, int storage) {
        bookname[storage] = booksName;
        bookQuantity[storage] = booksQuantity;
        storage++;

        return storage;      
    }

    public static void Update(int indexOfBook, String[] bookname, int[] bookquantity) {

        System.out.print("Enter New Book Name: ");
        String newName = in.nextLine();

        System.out.print("Enter New Quantity: ");
        int newQuantity = in.nextInt();
        in.nextLine();

        bookname[indexOfBook - 1] = newName;
        bookquantity[indexOfBook - 1] = newQuantity;
    }

    public static int Delete(int indexOfBook, String[] bookname, int[] bookquantity, int storageCount) {

        for (int i = indexOfBook - 1; i < storageCount - 1; i++) {
            bookname[i] = bookname[i + 1];
            bookquantity[i] = bookquantity[i + 1];
        }
        bookname[bookname.length - 1] = null;
        bookquantity[bookquantity.length - 1] = 0;
        storageCount--;

        return storageCount;
    }

    public static void Login() {
        String username = "Akel";
        String password = "251013131";
        int attempts = 0;
        do {
            attempts++;
            System.out.print("Enter Username: ");
            String userInput = in.nextLine();
            
            System.out.print("Enter Password: ");
            String passInput = in.nextLine();

            if (username.equals(userInput) && password.equals(passInput)) {
                System.out.println("~~ WELCOME TO AKEL'S LIBRARY! ~~");
                break;
            }
            else {
                System.out.println("ERROR: Wrong Username or Password!");
            }
            if (attempts == 3) {
                System.out.println("ERROR: You've Reached Your Maximum Attempts of 3 The Program Will Stop.");
                System.exit(0);
            }
        } while (true);
    }  
}