import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] array = {
            {"Akel", "Justine", "Josiah"},
            {"Onix", "Matthew", "Shion"}
        };

        displayArray(array);

        System.out.print("Enter what row to change: ");
        int row = in.nextInt();
        
        System.out.print("Enter what col to change: ");
        int col = in.nextInt();
        in.nextLine();

        System.out.print("Enter New Name: ");
        String name = in.nextLine();

        changeElement(row, col, name, array);

        displayArray(array);


    }
    public static void displayArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void changeElement(int row, int col, String name, String[][] array) {
        array[row - 1][col - 1] = name;
    }
}