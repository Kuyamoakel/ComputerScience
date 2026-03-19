import java.util.Scanner;

public class AtmMachine {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        
        boolean isRunning = true;
        double balance = 1000;
        // Pin validation
        int correctPin = 123494;
        int userInputPin;
        boolean isPinCorrent = false;;
        // Maximum Attempts
        int attempts = 0;


        System.out.println("==== WELCOME TO ATM ====");
        do {
            System.out.print("Enter your Pin: ");
            userInputPin = in.nextInt();
            attempts++;
            
            if (correctPin == userInputPin) {
                isPinCorrent = true;
                break;
            }
            if (attempts == 3) {
                System.out.println("You Have Reached Your 3 Maximum Attempts!");
                return;
            }
        } while (!isPinCorrent);
        System.out.println("Access Granted");

        while (isRunning) {
            System.out.print("""
                -----------------------
                ==== ATM MENU ====\n[1]Check Balance\n[2]Deposit Money\n[3]Withdraw Money\n[4]Exit
                -----------------------
                Enter you choice:""");
                int menu = in.nextInt();
                in.nextLine();

                switch (menu) {
                    case 1:
                        checkBalance(balance);
                        isRunning = wantToContinue( );
                        break;
                    case 2:
                        System.out.print("\nEnter amount to deposit: ");
                        double depositAmount = in.nextDouble();
                        in.nextLine(); // buffering

                        balance = deposit(balance, depositAmount);
                        isRunning = wantToContinue();
                        break;
                    case 3:
                        System.out.print("\nEnter amount to withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        in.nextLine(); // buffering

                        balance = withdraw(balance, withdrawAmount);
                        isRunning = wantToContinue();
                        break;
                    case 4:
                        System.out.println("Thank you so much for transacting to our Bank!");
                        return;
                    default:
                        System.out.println("Invalid Choice. Please Try Again");
                        break;
                }
        }
    
    }
    public static void checkBalance(double balance) {
        System.out.println("\nYou Current Balance is: $" + balance);
    }
    public static double deposit(double balance, double depositAmount) {

        if (depositAmount < 0) {
            System.out.println("You cannot deposit a negative amount.");
        } else {
            balance += depositAmount;
            System.out.println("Deposit Successful~");
            System.out.println("Updated Balance: $" + balance);
            
        }
        return balance;

    }
    public static double withdraw(double balance, double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("You cannot withdraw a negative amount.");

        } else if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdraw Succesful~");
            System.out.println("Updated Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
        
        return balance;

    }
    public static boolean wantToContinue() {
        System.out.print("\nDo you want to continue? (yes/no): ");
        String continueTransaction = in.nextLine();

        if (continueTransaction.equalsIgnoreCase("yes")) {
            return true;
        } else if (continueTransaction.equalsIgnoreCase("no")) {
            System.out.println("Thank you for going to our Bank!");
            return false   ;
        } else {
            System.out.println("That's Invalid input! Please Try Again");
            return true;
        }
    }
}