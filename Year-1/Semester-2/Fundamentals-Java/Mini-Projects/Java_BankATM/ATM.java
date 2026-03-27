import java.util.Scanner;
import java.util.ArrayList;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Double Balance = 1.00;
        int limit_withdraw = 3;
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            try {
                System.out.println("~~~~~ BANK ACCOUNT ~~~~");
                System.out.println("1. Deposit~");
                System.out.println("2. Withdraw~");
                System.out.println("3. Check Balance~");
                System.out.println("4. Transaction History~");
                System.out.println("5. Quit");
                System.out.print("Choices: ");
                
                int choices = input.nextInt();
                
                switch (choices) {
                    case 1:
                        System.out.println("~~~~~ DEPOSIT ~~~~~ ");
                        System.out.print("Input Desired Amount$: ");
                        Double depots = input.nextDouble();
                        Balance += depots;

                        System.out.println("DEPOSITED: $" + depots);
                        history.add("Deposited: $" + depots);
                        break;
                    case 2:
                        System.out.println("~~~~~ WITHDRAW ~~~~~" + " (" + limit_withdraw + ")");
                        System.out.print("Input Desired Amount$: ");
                        Double Withraws = input.nextDouble();

                        if (limit_withdraw <= 0) {
                            System.out.println("SORRY THE LIMIT OF WITHRAWAL TO DAY IS DONE!");
                            history.add("Daily Withdraw Limit: Try's to withdraw with done limit.");
                            break;
                        } else if (Withraws <= Balance) {
                            Balance -= Withraws;
                            System.out.println("WITHDRAWS: $" + Withraws);
                            history.add("Withdraw: $" + Withraws);
                            limit_withdraw -= 1;
                        } else {
                            System.out.println("Insufficient balance~");
                            history.add("Insufficient Balance Attempt: Try's to withdraw $" + Withraws + " With $" + Balance + " Balance.");
                        }
                        break;
                    case 3:
                        System.out.println("~~~~~ CHECK BAL ~~~~~");
                        System.out.println("Balance: $ " + Balance);
                        history.add("Check Balance: $" + Balance);
                        break;
                    
                    case 4:
                        System.out.println("~~~~~ TRANSACTION HISTORY ~~~~~");

                        for (String Hitories : history) {
                            System.out.println(Hitories);
                        }
                        break;
                    case 5:
                        for (int i = 10; i >= 1; i--) {
                            System.out.println(i);
                            Thread.sleep(100);
                        }
                        System.out.println("THANK YUII SO< MUCH~");
                        input.close();
                        System.out.flush();
                        return;
                    default:
                        System.out.println("INVALID INPUT");
                }

            } catch (Exception e) {
                System.out.println("Invalid input poh!");


            }
        }
    }
}