// Refresher Only

import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Grade " + (i+1) + ": ");
            int grade = in.nextInt();

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

            sum += grade;
        }
        String result = ((sum / 5) >= 75) ? "Passed" : "Failed";

        System.out.println("\n\nTotal: " + sum);
        System.out.println("Average: " + sum / 5);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Result: " + result);
        

    }
}