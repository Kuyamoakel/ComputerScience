import java.util.Scanner;

public class ShiftingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arry = new String[5];

        arry[0] = "Akel";
        arry[1] = "Akel";
        arry[2] = "Akel";
        arry[3] = "Akel";
        arry[4] = "Akel";
        display(arry);

        System.out.print("Enter what number to remove: ");
        int indexToRemove = in.nextInt();

        for (int i = indexToRemove - 1; i < arry.length - 1; i++) {
            arry[i] = arry[i +1];
        }
        arry[arry.length - 1] = null;

        display(arry);
    }
    public static void display(String[] arry) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != null) {
                System.out.println((i+1) + ". " + arry[i]);
            }
        }
    }
}