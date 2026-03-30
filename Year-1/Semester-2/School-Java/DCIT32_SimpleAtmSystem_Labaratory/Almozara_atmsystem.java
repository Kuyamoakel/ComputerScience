import java.util.Scanner;

public class Almozara_atmsystem {
    public static Scanner in = new Scanner(System.in);

    public static int correctPin = 5555;
    public static String transactionHistory = "";

    public static void main(String[] args) {

        int userInputPin = 0;
        double balance = 40000;

        enterPin(userInputPin, balance);
    }

    public static void showMenu(double balance) {
        double totalWithdrawAmount = 0, totalDepositAmount = 0;

        while (true) {
            System.out.print("\n==== BANK ACCOUNT ====\n[1]Check Balance\n[2]Withdraw\n[3]Deposit\n[4]Change Pin\n[5]Transaction History\n[6]Exit\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    checkBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double withdrawAmount = in.nextDouble();

                    if (withdrawAmount < 100) {
                        System.out.println("Transaction Failed: Minimum Withdrawal: PHP 100");
                        continue;
                    }
                    if (withdrawAmount > 20000) {
                        System.out.println("Transaction Failed: Maximum per Transaction: PHP 20,000");
                        continue;
                    }
                    if (withdrawAmount > balance) {
                        System.out.println("Transaction Failed: insufficient Balance");
                        continue;
                    }

                    totalWithdrawAmount += withdrawAmount;
                    balance = withdraw(balance, withdrawAmount, totalWithdrawAmount);
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    double depositAmount = in.nextDouble();

                    if (depositAmount < 100) {
                        System.out.println("Transaction Failed: Minimum Deposit: PHP 100");
                        continue;
                    }
                    if (depositAmount > 200000) {
                        System.out.println("Transaction Failed: Maximum per Transaction: PHP 200,000");
                        continue;
                    }

                    totalDepositAmount += depositAmount;
                    balance = deposit(balance, depositAmount, totalDepositAmount);
                    break;

                case 4:
                    System.out.print("Do you really want to change your Pin? (y/n): ");
                    String validation = in.nextLine();

                    if (validation.equalsIgnoreCase("y")) {
                        changePin(balance);
                    } else if (validation.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;

                case 5:
                    showTransactionHistory();
                    break;

                case 6:
                    System.out.println("Thank you for going to our bank! THANK YOU!");
                    return;

                default:
                    System.out.println("ERROR: Invalid Input! Please Try Again");
                    break;
            }
        }
    }

    public static void checkBalance(double balance) {
        System.out.println("Current Balance: PHP " + balance);
    }

    public static double withdraw(double balance, double withdrawAmount, double totalWithdrawAmount) {

        if (totalWithdrawAmount > 50000) {
            System.out.println("Daily Withdrawal Limit: PHP 50,000");
        } else {
            System.out.println("Successfully Withdrawn: PHP" + withdrawAmount);
            balance -= withdrawAmount;
            transactionHistory += "Withdrew: PHP " + withdrawAmount + "\n";
            printReceipt("Withdraw", withdrawAmount, balance);
        }

        return balance;
    }

    public static double deposit(double balance, double depositAmount, double totalDepositAmount) {

        if (totalDepositAmount > 500000) {
            System.out.println("Daily Deposit Limit: PHP 500,000");
        } else {
            System.out.println("Successfully Deposit: PHP" + depositAmount);
            balance += depositAmount;
            transactionHistory += "Deposited: PHP " + depositAmount + "\n";
            printReceipt("Deposit", depositAmount, balance);
        }

        return balance;
    }

    public static void printReceipt(String type, double amount, double balance) {
        System.out.println("\n===== TRANSACTION RECEIPT =====");
        System.out.println("Type: " + type);
        System.out.println("Amount: PHP " + amount);
        System.out.println("Available Balance: PHP " + balance);
        System.out.println("================================\n");
    }

    public static void showTransactionHistory() {
        if (transactionHistory.equals("")) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\n=== TRANSACTION HISTORY ===");
            System.out.println(transactionHistory);
        }
    }

    public static void changePin(double balance) {
        String newPin;
        String confirmNewPin;

        while (true) {
            System.out.print("\nEnter New Pin: ");
            newPin = in.next();

            boolean isValid = true;
            for (int i = 0; i < newPin.length(); i++) {
                if (!Character.isDigit(newPin.charAt(i))) {
                    isValid = false;
                    break;
                }
            }

            if (!isValid || newPin.length() < 4 || newPin.length() > 6) {
                System.out.println("Invalid PIN format.");
                continue;
            }

            System.out.print("Confirmed New Pin: ");
            confirmNewPin = in.next();

            if (!newPin.equals(confirmNewPin)) {
                System.out.println("ERROR: PINs do not match!");
            } else {
                correctPin = Integer.parseInt(newPin);
                System.out.println("\nPIN is successfully changed!");
                break;
            }
        }

        enterPin(0, balance);
    }

    public static void enterPin(int userInputPin, double balance) {
        int maxAttempts = 0;
        boolean isPinCorrect = false;

        System.out.println("\n==== PLEASE ENTER YOUR PIN ====");

        do {
            System.out.print("Enter Pin: ");
            userInputPin = in.nextInt();
            maxAttempts++;

            if (userInputPin == correctPin) {
                isPinCorrect = true;
                break;
            } else {
                System.out.println("ERROR: Incorrect PIN!");
            }
            if (maxAttempts == 3) {
                System.out.println("ERROR: Account has been locked. Please contact customer service.");
                System.exit(maxAttempts);
            }
        } while (!isPinCorrect);
        
        showMenu(balance);
    }
}