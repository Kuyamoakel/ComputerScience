import java.util.Scanner;

public class Modifiying {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arry = new String[5];

        arry[0] = "Akel";
        arry[1] = "Akel";
        arry[2] = "Akel";
        arry[3] = "Akel";
        arry[4] = "Akel";

        diplayinfo(arry);

        System.out.print("Enter the number to Modifiy: ");
        int indexToModify = in.nextInt();
        in.nextLine();

        System.out.print("Enter What's the Name: ");
        String name = in.nextLine();

        arry[indexToModify - 1] = name;
        
        diplayinfo(arry);

    }
    public static void diplayinfo(String[] arry) {
        for (int i = 0; i < arry.length; i++) {
            System.out.println((i+1) + ". " + arry[i]);
        }
    }
}
