import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int reversed = 0;


        while (number > 0) {
            int digit = number % 10; // Getting the last number
            reversed = reversed * 10 + digit; // add niya yung new number sa left, basically pinag dikit dikit niya langs
            number = number / 10; // Removing the last number
        }

        System.out.println(reversed);

        in.close();
    }
}