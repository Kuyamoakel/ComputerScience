import java.util.Scanner;

public class MultiArraySMS {
    public static Scanner in = new Scanner(System.in);
    final public static int STUDENTS_LIMIT = 50; // maximum Students Allowed 50.
    public static void main(String[] args) {
        
        boolean isRunning = true;
        //Students Limit sa Array
        int studentsIn = 0;

        String[][] students = new String[STUDENTS_LIMIT][4]; // 4 for id, name, age, Grade A.

        while (isRunning) {
            System.out.print("\n===== STUDENT MANANGEMENT SYSTEM =====\n1. Add Students\n2. View All Students\n3. Search Student\n4. Update Student\n5. Delete Student\n6. Exit\nChoose an Option: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("===== ADDING STUDENTS =====");
                    String studentNumber = getInput("Enter Student No.: ");
                    String studentName = getInput("Enter Student Name: ");
                    String studentAge = getInput("Enter Student Age: ");
                    String studentGrade = getInput("Enter Student Grade: ");

                    students = addStudents(students, studentNumber, studentName, studentAge, studentGrade, studentsIn);
                    studentsIn++;
                    break;
                case 2:
                    System.out.println("\n==== STUDENT LIST ====\n-----------------------");
                    for (int i = 0; i < studentsIn; i++ ) {
                        System.out.println("ID: " + students[i][0] + "\n" +
                                         "Name: " +  students[i][1] + "\n" +
                                         "Age: " + students[i][2] + "\n" +
                                         "Grade: " + students[i][3] + "\n" +
                                         "-----------------------"
                            );
                    }
                    break;
                case 3:
                    System.out.print("=====StudentSearch=====\nEnter Student number: ");
                    String studentSearch = in.nextLine();

                    for (int i = 0; i < studentsIn; i++) {
                        if (students[i][0].equals(studentSearch)) {
                            System.out.println("\nStudent Found!");
                            System.out.println("-----------------------" + "\n" +
                                         "ID: " + students[i][0] + "\n" +
                                         "Name: " +  students[i][1] + "\n" +
                                         "Age: " + students[i][2] + "\n" +
                                         "Grade: " + students[i][3] + "\n" +
                                         "-----------------------"
                            );
                            break;
                        }
                        System.out.println("Student Not Found!");
                    }
                    break;
                default:
                    break;
            }

        }

    }
    public static String[][] addStudents(String[][] students, String number, String name, String age, String grade, int StudentCount) {

        if (StudentCount == STUDENTS_LIMIT) {
            System.out.println("The Maximum Students Have been Reached! " + STUDENTS_LIMIT + " Students");
            return students;
        }

        students[StudentCount][0] = number;
        students[StudentCount][1] = name;
        students[StudentCount][2] = age;
        students[StudentCount][3] = grade;
        return students;
    }
    public static String getInput(String message) {
        String input;
        do {
            System.out.print(message);
            input = in.nextLine();
        } while (input.isEmpty());
        return input;
    }
}