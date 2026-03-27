import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int student = 0;
        double studentComputedGrade;

        while (true) {
            System.out.print("\nEnter number of subjects (0 to exit): ");
            int numberOfSubjects = in.nextInt();
            
            if (numberOfSubjects == 0) {
                System.out.println("Program terminated.");
                break;
            }
            student++;
            double studentSumGrade = 0;
            int validSubjects = 0;
            
            int[] subjects = new int[numberOfSubjects];

            for (int i = 0; i < subjects.length; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                subjects[i] = in.nextInt();

                if (subjects[i] < 0) {
                    System.out.println("Invalid, Grade, Skipping...");
                    continue;
                }
                validSubjects++;
                studentSumGrade += subjects[i];
            }

            if (validSubjects == 0) {
                System.out.println("No Valid Grades Entered.");
                continue;
            }

            studentComputedGrade = studentSumGrade / validSubjects;

            if (studentComputedGrade >= 75) {
                System.out.printf("Student %d Passed with %.2f\n", student, studentComputedGrade);
            } else {
                System.out.printf("Student %d Failed with %.2f\n", student, studentComputedGrade);
            }
            studentSumGrade = 0.0;

        }
    }
 
}
