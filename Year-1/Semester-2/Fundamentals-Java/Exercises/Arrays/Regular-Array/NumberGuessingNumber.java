import java.util.Scanner;

public class NumberGuessingNumber {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);

        String[] lowerMessage = {
            "Lower Lods!",
            "Ano Bayan, Lower pa!",
            "Malay mo malapit kana Lower!",
            "Hayst! Lower pa",
            "Aba Aba! Lower pa"
        };

        String[] higherMessage = {
            "Higher Po!",
            "Siguro Taasan Mopa!",
            "Diko Alam eh! Higher pa siguro?",
            "Let's Go Pero mag Higher kamuna",
            "Malapit na siguro Higher let's go!"
        };

        boolean isSecretFound = false;

        
        System.out.print("Enter 1 Up to number to guess: ");
        int upToNumber = in.nextInt();
        
        final int secretNumber = (int) (Math.random() * upToNumber + 1); // i don't want Zero hahaha
        
        while (!isSecretFound) {
            int lowerIndex = (int)(Math.random() * lowerMessage.length);
            int higherIndex = (int)(Math.random() * higherMessage.length);

            System.out.print("\nEnter Guess: ");
            int userGuess = in.nextInt();

            if (userGuess > upToNumber) {
                System.out.println("Akala koba hanggang " + upToNumber + " Kalang? batnaman diyan ka.");
            }
            if (userGuess > secretNumber) {
                System.out.println(lowerMessage[lowerIndex]);
            }
            if (userGuess < secretNumber) {
                System.out.println(higherMessage[higherIndex]);
            }
            if (userGuess == secretNumber) {
                System.out.println("\nWoW You've Made it!");
                isSecretFound = true;
            }
        }
        
        System.out.println("The Secret Number is " + secretNumber);

    }
}
