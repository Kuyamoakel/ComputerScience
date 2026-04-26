import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = in.nextInt();

        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }
        System.out.println("Count of Numbers: " + count);

        in.close();
    }
}
