import java.util.Scanner;

public class Getindex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter a Word: ");
        String word = in.nextLine();

        System.out.print("Enter a letter: ");
        char ch = in.nextLine().charAt(0);

        System.out.println(getindexes(word, ch));

        
    }
    public static String getindexes(String word, char ch) {

        String list = "";
        int adder = 0;
        boolean isFound = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                isFound = true;
                if (adder != 0) {
                    list += ", ";
                }
                list += word.indexOf(ch, i);
                adder++;
            } 
        }

        if (!isFound) {
            System.out.println("Not Found!");
        }

        return list;
    }
}
