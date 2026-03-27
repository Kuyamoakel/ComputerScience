import java.util.Scanner;

public class Almozara_atmsystem {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int userInputPin, correctPin = 5555;
        double balance = 40000;
    
        int maxAttempts = 0;
        boolean isPinCorrect = false;

        do {
            System.out.print("Enter Pin: ");
            userInputPin = in.nextInt();
            maxAttempts++;

            if (userInputPin == correctPin) {
                isPinCorrect = true;
                break;
            }
            if (maxAttempts == 3) {
                System.out.println("ERROR: Account has been locked. Please contact customer service.");
                return;
            }
        } while (!isPinCorrect);

        showMenu(balance);
    }

    public static void showMenu(double balance) {
        double totalWithdrawAmount = 0, totalDepositAmount = 0;

        while (true) {
            System.out.print("==== BANK ACCOUNT ====\n[1]Check Balance\n[2]Withdraw\n[3]Deposit\n[4]Exit\nChoices: ");
            int menu = in.nextInt();

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
                    balance = deposit(balance, depositAmount,totalDepositAmount);
                    break;
                case 4:
                    System.out.println("Thank you So much!");
                    return;
                default:
                    System.out.println("Invalid Input! Please Try Again");
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
        }

        return balance;
    }
    public static double deposit(double balance, double depositAmount, double totalDepositAmount) {
        
        if (totalDepositAmount > 500000) {
            System.out.println("Daily Deposit Limit: PHP 500,000");
        } else {
            System.out.println("Successfully Deposit: PHP" + depositAmount);
            balance += depositAmount;
        }

        return balance;
    }
    
    
}