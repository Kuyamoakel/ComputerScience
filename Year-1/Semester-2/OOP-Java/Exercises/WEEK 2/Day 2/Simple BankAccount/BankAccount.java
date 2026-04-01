import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    public void checkBalance() {
        System.out.printf("Balance: %,.2f\n", balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
           System.out.println("Invalid Amount: " + amount);
        } else {
            balance += amount;
            System.out.println("Successfully Deposited!");
        }
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Successfully Withdrawn");
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        BankAccount account1 = new BankAccount(500);
        
        while (true) {
            System.out.println("==== BANK ACCOUNT ====");
            System.out.print("[1]Check Balance\n[2]Deposit\n[3]Withdraw\n[4]Exit\nChoices: ");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    account1.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    double depositAmount = in.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Amount: ");
                    double withdrawAmount = in.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("thank you so much!");
                    return;
                default:
                    System.out.println("Invalid Input po");
                    break;
            }
        }
    }
}
