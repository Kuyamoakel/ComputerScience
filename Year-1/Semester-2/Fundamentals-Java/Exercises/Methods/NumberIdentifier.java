import java.util.Scanner;

public class NumberIdentifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Integer: ");
        int number = in.nextInt();

        System.out.println(checkNumber(number));
        
    }
    public static String checkNumber(int num) {

        String value = "";

        if (num == 0) {
            value = "Zero";
        }
        if (num < 0) {
            value = "Negative";
        }
        if (num > 0) {
            value = "Positive";
        }

        return value;


    }
}