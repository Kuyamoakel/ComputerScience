import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("T001", "Debugging", "Need to center a div", "Senior Eng."));
        tasks.add(new Task("T002", "New PC", "Needed new set of computers", "Head Budget"));
        tasks.add(new Task("T003", "Hiring", "Hire new emplooyes for the IT department", "Second Hr"));

        employees.add(new Employee("E001", "Akel", "IT", "Senior Eng.", null));
        employees.add(new Employee("E002", "Justine", "IT", "Senior Eng.", null));
        employees.add(new Employee("E003", "Matthew", "Marketing", "Head budget", null));
        employees.add(new Employee("E004", "Onix", "HR", "Head Hr", null));
        employees.add(new Employee("E005", "Shion", "HR", "Second Hr", null));

        while (true) {
            System.out.print("""
                    ====== COMPANY MANAGEMENT =====
                    1. Check Tasks
                    2. Check Employees
                    3. Add Task to Employees
                    4. Create Task
                    5. Exit
                    Choice:""");
            int dashBoard = input.nextInt();
            input.nextLine();

            switch (dashBoard) {
                case 1:
                    System.out.println("===== CURRENT EXISTING TAKS =====");
                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                    break;
                case 2:
                    System.out.println("===== CHECK EMPLOYEES =====");
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 3:
                    System.out.println("===== ADD TASK TO EMPLOYEE =====");
            
                    Employee employeeHolder = null;
                    Task taskHolder = null;

                    System.out.print("Find Emplyoee: ");
                    String findEmployee = input.nextLine();
                    
                    for (Employee employee : employees) {
                        if (employee.getEmployeeId().equals(findEmployee)) {
                            employeeHolder = employee;
                        }
                    }

                    if (employeeHolder == null) {
                        System.out.println("Cannot find Employee");
                        break;
                    }

                    if (employeeHolder.getTask() != null) {
                        System.out.println("Employee Already have Task!");
                        break;
                    }

                    System.out.print("Enter Task ID: ");
                    String taskID = input.nextLine();

                    for (Task task : tasks) {
                        if (task.getTaskId().equals(taskID)) {
                            taskHolder = task;
                        }
                    }

                    if (taskHolder == null) {
                        System.out.println("Cannt find Task Id");
                        break;
                    }

                    employeeHolder.assignTask(taskHolder);
                    break;
                case 4:
                    System.out.println("===== CREATE TASK ====");
                    System.out.print("Enter Task ID (T00 Format): ");
                    String newTaskID = input.nextLine();

                    boolean isFound = false;

                    for (Task task : tasks) {
                        if (task.getTaskId().equals(newTaskID)) {
                            isFound = true;
                        }
                    }

                    if (isFound) {
                        System.out.println("ERROR: it is used Task ID: " + newTaskID);
                        break;
                    }
 
                    System.out.print("Enter Task Name: ");
                    String newTaskName = input.nextLine();

                    System.out.print("Enter Task Description: ");
                    String newTaskDescription = input.nextLine();

                    System.out.print("Enter Specialization Requirement: ");
                    String newSpecialization = input.nextLine();

                    tasks.add(new Task(newTaskID, newTaskName, newTaskDescription, newSpecialization));
                    System.out.println("Sucessfully Added!");
                    System.out.println("Task ID: " + newTaskID);
                    System.out.println("Task Name: " + newTaskName);
                    System.out.println("Task Description: " + newTaskDescription);
                    System.out.println("Task Specialization: " + newSpecialization);
                    break;
                default:
                    break;
            }


        }
    }
}
