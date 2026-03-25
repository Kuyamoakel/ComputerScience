import java.util.Scanner;

public class Practicing_Array {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        int balance;
        int depositMoney = 0;
        final int Max_Deposit_Amount = 20000;
        final int Minimum_Deposit_Amount = 100;
        int i = 0;

        System.out.print("Set Your Current Balance Gonna Be: ");
        balance = in.nextInt();

        while (true) {
            try {
                System.out.print("\nCurrent Balance: $" + balance + "\nenter how many deposit you will make (enter 0 to quit): ");
                int howMany = in.nextInt();
            
                if (howMany == 0) {
                    System.out.println("Thank you So Much!");
                    break;
                }

                int[] depositList = new int[howMany];
                System.out.print("===== PLEASE PROCEED HERE =====");
                for (i = 0; i < depositList.length; i++) {
                    System.out.print("\nEnter Number " + (i + 1) +" Deposit Amount: ");
                    depositList[i] = in.nextInt();
                    if (depositList[i] < Minimum_Deposit_Amount) {
                    System.out.println("Deposit Must Be atleast $100 Minimum");
                    continue;
                }
                if (depositList[i] > Max_Deposit_Amount) {
                    System.out.println("Deposit Must Be No Higher Than $20,000");
                    continue;
                }
                balance += depositList[i];
            }
                balance = depositAmount(balance, depositMoney);
                depositMoney = 0;
            } catch (Exception e) {
                System.out.println("You Must Put Integerst Not Letters!");
                break;
            }
        }

    }
    public static int depositAmount(int balance, int deposit) {
        balance += deposit;
        return balance;
    }
}