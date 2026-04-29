import java.util.Scanner;

public class Almozara_ArrayLab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[40];
        int[] grades = new int[40];

        names[0] = "Pedro";
        grades[0] = 70;

        names[5] = "Maria";
        grades[5] = 80;

        int studentCount = 0;

        while (true) {
            System.out.print("\n[1]Add new Student\n[2]Search student by Name\n[3]Display All Student\n[4]Update Student grade\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter New Student Name: ");
                    String newStudent = in.nextLine();

                    System.out.print("Enter Student Grade: ");
                    int newGrade = in.nextInt();

                    boolean isExist = false;

                    for (int i = 0; i < names.length; i++) {
                        if (newStudent.equals(names[i])) {
                            isExist = true;
                            break;
                        }
                    }

                    if (isExist) {
                        System.out.println("Studnt Already Exist");
                        break;
                    }

                    if (studentCount == 5 || studentCount == 0) {
                        System.out.println("Succesfully Added");
                        names[studentCount + 1] = newStudent;
                        grades[studentCount + 1] = newGrade;
                        studentCount++;
                        break;
                    } else {
                        System.out.println("Succesfully Added");
                        names[studentCount] = newStudent;
                        grades[studentCount] = newGrade;
                        studentCount++;
                        break;
                    }
                case 2:
                    System.out.print("Enter Name of Student: ");
                    String studentName = in.nextLine();

                    boolean isFound = false;

                    for(int i = 0; i < names.length; i++) {
                        if (studentName.equals(names[i])) {
                            System.out.println("Student Name: " + names[i] + " | Student Grade: " + grades[i]);
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Student Not Found");
                    }
                    break;
                    case 3:
                        displayStudent(names, grades);
                        break;
                    case 4:
                        System.out.print("Enter Name of Student: ");
                        String studentName1 = in.nextLine();

                        boolean isFound1 = false;

                        for(int i = 0; i < names.length; i++) {
                            if (studentName1.equals(names[i])) {
                            System.out.println("Student Name: " + names[i] + " | Student Grade: " + grades[i]);
                            isFound1 = true;
                            break;
                            }
                        }

                        if (!isFound1) {
                            System.out.println("Student Not Found!");
                        }
                        break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
    public static void displayStudent(String[] names, int[] grades) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && grades[i] != 0) {
                System.out.println((1+i) + ". " + names[i] + " | Grade: " + grades[i]);
            }
        }
    }
}
