import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Password Checker if it's Strong;
        boolean isCorrect = false;

        do {
            System.out.print("Enter a Password: ");
            String password = in.nextLine();
            isCorrect = checkerPassword(isCorrect, password);
        } while (!isCorrect);

        System.out.println("Welcome to your account!");
    }
    public static boolean checkerPassword(boolean isCorrect, String password) {
        boolean isDigit = false;
        boolean isUpper = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                isDigit = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                isUpper = true;
            }
            if (isDigit && isUpper) {
                isCorrect = true;
                break;
            }
        }

        if (!isCorrect) {
            System.out.println("Password Need to be Strong!");
        }
        return isCorrect;
    }
}
