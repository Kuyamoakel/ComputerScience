import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Current Floor: ");
        int i = in.nextInt();

        System.out.print("Target Floor: ");
        int target = in.nextInt();

        for (int floor = i + 1; floor <= target; floor++) {
            System.out.println("Floor " + floor);
        }
        System.out.println("Arrived");

        in.close();
    }
}