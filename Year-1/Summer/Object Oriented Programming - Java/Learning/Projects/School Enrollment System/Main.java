    import java.lang.classfile.instruction.ReturnInstruction;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        public static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("===== CVSU =====");
                System.out.print("\n[1] Enroll\n[2] View Students\n[3] Exit\n[4] Choices: ");
                int menu = in.nextInt();
                in.nextLine();

                switch (menu) {
                    case 1 -> {
                        System.out.print("===== REGISTRATION =====\nEnter Name: ");
                        String studentName = in.nextLine();

                        System.out.print("Enter Age: ");
                        int studentAge = in.nextInt();

                        System.out.println("\nChoice Course: ");
                        System.out.print("[1] Computer Science\n[2] Tourism\n[3] Nursing\nChoices: ");
                        int courseChouce = in.nextInt();

                        boolean isEnrolled = false;
                        switch (courseChouce) {
                            case 1 -> {
                                students.add(new ComputerScience(studentName, studentAge));
                                isEnrolled = true;
                            }

                            case 2 -> {
                                students.add(new Tourism(studentName, studentAge));
                                isEnrolled = true;
                            }
                            case 3 -> {
                                students.add(new Nursing(studentName, studentAge));
                                isEnrolled = true;
                            }

                            default -> {System.out.println("Invalid choice!");}
                        }
                        if (isEnrolled) {
                            System.out.println("Succesfully Enrolled!");
                        }
                    }
                    case 2 -> {
                        System.out.println("===== STUDENTS =====");
                        for (Student student : students) {
                            System.out.println(student);
                            System.out.println();
                        }
                    }
                    case 3 -> {
                        System.out.println("THANK YOU!");
                        return;
                    }
                    default -> {System.out.println("Invalid choice:");}
                }
            }
        }
    }