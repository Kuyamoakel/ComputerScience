import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            System.out.print(digit);

            number = number / 10;

            if (number == 0) {
                break;
            }

            System.out.print(" + ");
        }
        System.out.print(" = " + sum);

        in.close();
    }
}