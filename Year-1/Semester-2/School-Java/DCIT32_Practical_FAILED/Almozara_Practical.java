import java.util.Scanner;

//failed this practical because of pressure haha.
//also for not coding for almost a month.
//forgot to use booleans and simple String methods.
// and now this is the SOLUTION.

public class Almozara_Practical {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = in.nextLine().charAt(0);

        System.out.println("Character '" + ch + "' at indeces: ");

        getCharacterindexes(word, ch);

    }
    public static void getCharacterindexes(String word, char ch) {
        boolean isFound = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                System.out.print(i + ", ");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Not Found!");
        }
    }
}