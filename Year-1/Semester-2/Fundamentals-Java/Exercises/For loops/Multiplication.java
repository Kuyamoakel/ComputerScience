import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter what Multiply: ");
            int multiply = in.nextInt();
    
            System.out.print("Enter Limit: ");
            int limit = in.nextInt();
            in.nextLine(); 

            if (limit <= 0) {
                System.out.println("Limit must be Positive!");
                continue;
            }
            
    
            for (int i = 1; i <= limit; i++) {
                System.out.println(multiply + " x " + i + " = " + multiply * i);
            }
        }
    }
}
