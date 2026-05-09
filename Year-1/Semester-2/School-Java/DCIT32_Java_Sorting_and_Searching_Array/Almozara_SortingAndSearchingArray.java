import java.util.Scanner;

public class Almozara_SortingAndSearchingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[40];
        int[] grades = new int[40];

        names[0] = "Pedro";
        grades[0] = 70;

        names[5] = "Maria";
        grades[5] = 80;

        int studentCount = 2;

        while (true) {
            System.out.println("\n===== CAVITE UNIVERSITY =====");
            System.out.print("[1] Add new Student\n[2] Search Student by Name\n[3] Display All Students" +
                    "\n[4] Update Student grade\n[5] Display Grades (Highest to Lowest)" +
                    "\n[6] Display Grades (Lowest to Highest)\n[7] Exit\nChoice: ");
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
                        System.out.println("Student Already Exist");
                        break;
                    }

                    if (newGrade > 100 || newGrade < 0) {
                        System.out.println("Grade must be between 0 and 100 only.");
                        break;
                    }
                    studentCount = addNewStudent(newStudent, newGrade, names, grades, studentCount);
                    break;
                case 2:
                    System.out.print("Enter Name of Student: ");
                    String studentName = in.nextLine();
                    searchStudent(names, grades, studentName);
                    break;
                case 3:
                    displayStudent(names, grades);
                    highestStudent(names, grades);
                    lowestStudent(names, grades);
                    break;
                case 4:
                    System.out.print("Enter Name of Student: ");
                    String studentName1 = in.nextLine();
                    updatingStudent(names, studentName1, grades, in);
                    break;
                case 5:
                    sortingToHighest(names, grades);
                    break;
                case 6:
                    sortingToLowest(names, grades);
                    break;
                case 7:
                    System.out.println("Thank you so much po!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }
    }

    public static int addNewStudent(String newStudent, int newGrade, String[] names, int[] grades, int studentCount) {

        if (studentCount >= grades.length) {
            System.out.println("Student list is full");
            return studentCount;
        }

        if (newStudent.trim().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return studentCount;
        }

        // finding the empty slots
        int slot = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                continue;
            }
            slot = i;
            break;
        }

        if (slot == -1) {
            System.out.println("No Available Slot!");
            return studentCount;
        }

        names[slot] = newStudent;
        grades[slot] = newGrade;
        studentCount++;
        System.out.println("~~ Successfully Added ~~");
        return studentCount;
    }

    public static void highestStudent(String[] names, int[] grades) {
        int max = -1; // just making sure because after sorting the index zero might be zero, soooo
                      // just making sure. NOT FOUND YET
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                continue;
            }

            if (grades[i] > max) {
                max = grades[i];
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("\n=== HIGHEST STUDENT ===\n" + names[index] + " | Grade: " + grades[index]);
        }
    }

    public static void lowestStudent(String[] names, int[] grades) {
        int min = Integer.MAX_VALUE; // why ?? we are getting the highest value possible, so in the first iteration
                                     // the min variable will have value.
        int index = -1;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                continue;
            }

            if (grades[i] < min) {
                min = grades[i];
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("\n=== LOWEST STUDENT ===\n" + names[index] + " | Grade: " + grades[index]);
        }
    }

    public static void sortingToHighest(String[] names, int[] grades) {

        for (int i = 0; i < names.length - 1; i++) {

            for (int k = 0; k < names.length - 1; k++) {

                // move non-null student forward if left side is null
                if (names[k] == null && names[k + 1] != null) {

                    String tempName = names[k];
                    names[k] = names[k + 1];
                    names[k + 1] = tempName;

                    int tempGrade = grades[k];
                    grades[k] = grades[k + 1];
                    grades[k + 1] = tempGrade;
                }

                // normal descending sort
                else if (names[k] != null && names[k + 1] != null &&
                        grades[k] < grades[k + 1]) {

                    int tempGrade = grades[k];
                    grades[k] = grades[k + 1];
                    grades[k + 1] = tempGrade;

                    String tempName = names[k];
                    names[k] = names[k + 1];
                    names[k + 1] = tempName;
                }
            }
        }

        System.out.println("=== GRADES (Highest to Lowest) ===");

        int count = 1;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(count + ". " + names[i] + " | Grade: " + grades[i]);
                count++;
            }
        }
    }

    public static void sortingToLowest(String[] names, int[] grades) {

        for (int i = 0; i < names.length - 1; i++) {

            for (int k = 0; k < names.length - 1; k++) {

                // move non-null student forward if left side is null
                if (names[k] == null && names[k + 1] != null) {

                    String tempName = names[k];
                    names[k] = names[k + 1];
                    names[k + 1] = tempName;

                    int tempGrade = grades[k];
                    grades[k] = grades[k + 1];
                    grades[k + 1] = tempGrade;
                }

                // normal ascending sort
                else if (names[k] != null && names[k + 1] != null &&
                        grades[k] > grades[k + 1]) {

                    int tempGrade = grades[k];
                    grades[k] = grades[k + 1];
                    grades[k + 1] = tempGrade;

                    String tempName = names[k];
                    names[k] = names[k + 1];
                    names[k + 1] = tempName;
                }
            }
        }

        System.out.println("=== GRADES (Lowest to Highest) ===");

        int count = 1;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(count + ". " + names[i] + " | Grade: " + grades[i]);
                count++;
            }
        }
    }

    public static void searchStudent(String[] names, int[] grades, String studentName) {
        boolean isFound = false;

        for (int i = 0; i < names.length; i++) {
            if (studentName.equals(names[i])) {
                System.out.println("Student Name: " + names[i] + " | Student Grade: " + grades[i]);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Student Not Found");
        }
    }

    public static void updatingStudent(String[] names, String studentName1, int[] grades, Scanner in) {
        boolean isFound1 = false;
        int i;

        for (i = 0; i < names.length; i++) {
            if (!studentName1.equals(names[i])) {
                continue;
            }
            isFound1 = true;
            break;
        }

        if (!isFound1) {
            System.out.println("Student Not Found!");
            return;
        }

        System.out.print("Enter new Grade: ");
        int gradeNew = in.nextInt();

        if (gradeNew > 100 || gradeNew < 0) {
            System.out.println("Grade must be between 0 and 100 only.");
            return;
        }

        grades[i] = gradeNew;
        System.out.println("Student Grade Successfully Updated");
        return;
    }

    public static void displayStudent(String[] names, int[] grades) {

        System.out.println("=== STUDENT LIST ===");
        int count = 1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(count + ". " + names[i] + " | Grade: " + grades[i]);
                count++;
            }
        }
    }
}