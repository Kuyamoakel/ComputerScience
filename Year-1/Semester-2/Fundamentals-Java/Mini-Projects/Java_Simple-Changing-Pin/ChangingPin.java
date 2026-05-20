import java.util.Scanner;

public class ChangingPin {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int correctPin = 5555;

        validationOfPIn(correctPin);


    }
    public static void validationOfPIn(int correctPin) {
        System.out.println("\n==== WELCOME ====");
        do {
            System.out.print("Enter Pin: ");
            int userInput = in.nextInt();

            if (userInput != correctPin) {
                System.out.println("ERROR: Wrong Pin!");
                continue;
            }

            break;
        } while (true);

        correctPin = menu(correctPin);

    }
    public static int menu(int correctPin) {
        
        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.print("[1] Change Pin\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    correctPin = changePin(correctPin);
                    validationOfPIn(correctPin);
                    break;
                default:
                    System.out.println("Invalid Input po");
                    break;
            }
        }
    
    }
    public static int changePin(int correctPin) {

        String newPin, confirmedNewPin;
        boolean isValid = false;;

        do {
            System.out.print("\nEnter New Pin: ");
            newPin = in.nextLine().trim();

            System.out.print("Enter Confirmed Pin: ");
            confirmedNewPin = in.nextLine().trim();

            
            if (newPin.length() < 4 || newPin.length() > 6) {
                System.out.println("ERROR: Must be atleast 4 - 6");
                continue;
            }
            if (!newPin.equals(confirmedNewPin)) {
                System.out.println("ERROR: They Are not Matched!");
                continue;
            }

            isValid = true;

            for (int i = 0; i < newPin.length(); i++) {
                if (!Character.isDigit(newPin.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                break;
            } else {
                System.out.println("ERROR: Invalid Pin!");
                continue;
            }
        } while (true);

        String extraction = newPin.substring(0, newPin.length());
        int newPins = Integer.parseInt(extraction);

        return newPins;
    }
}