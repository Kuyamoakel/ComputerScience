import java.util.Scanner;

public class Dugeon {
    public static Scanner in = new Scanner(System.in);

    public static void creatingDugeon(char[][] dugeon) {
        for (int row = 0; row < dugeon.length; row++) {
            System.out.printf("Enter Row %d: ", row + 1);
            String inputs = in.nextLine();

            for (int col = 0; col < dugeon[row].length; col++) {
                dugeon[row][col] = inputs.charAt(col);
            }
        }
        dugeonPrint(dugeon);
    }

    public static void dugeonPrint(char[][] dugeon) {
        for (int row = 0; row < dugeon.length; row++) {
            for (int col = 0; col < dugeon[row].length; col++) {
                System.out.print(dugeon[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int findStart(char[][] dugeon) {
        int startPosition = 0;
        
        for (int row = 0; row < dugeon.length; row++) {
            for (int col = 0; col < dugeon[row].length; col++) {
                if (dugeon[row][col] == 'S') {
                    startPosition = dugeon[row][col];
                }
            }
        }
        return startPosition;
    }
    public static void main(String[] args) {

        
        System.out.print("Enter how many row: ");
        int rows = in.nextInt();
        
        System.out.print("Enter how many col: ");
        int col = in.nextInt();
        in.nextLine();

        char[][] dugeon = new char[rows][col];

        creatingDugeon(dugeon);
        
        System.out.println(findStart(dugeon));
    }
}