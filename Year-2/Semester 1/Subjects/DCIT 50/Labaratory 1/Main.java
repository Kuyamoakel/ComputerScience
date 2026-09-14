import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Position> positions = new ArrayList<>();
        ArrayList<Task> tasks = new ArrayList<>();

        // Departments Objects
        Department it = new Department("DOO1", "Information Technology");
        Department accounting = new Department("DOO2", "Accounting");
        Department hr = new Department("DOO3", "Human Resources");
        
        departments.add(it);
        departments.add(accounting);
        departments.add(hr);
        
        // Positions Objects
        Position seniorDev = new Position("Senior Developer", it);
        Position hrOff = new Position("Human Resource Officer", hr);
        Position accStaff = new Position("Accounting Staff", accounting);
        Position hrStaff = new Position("Human Resource Staff", hr);
        Position itSupport = new Position("IT Support", it);

        positions.add(seniorDev);
        positions.add(hrOff);
        positions.add(accStaff);
        positions.add(hrStaff);
        positions.add(itSupport);
        
        // Task Objects
        tasks.add(new Task("T001", "Debugging", "Need to center a div", it));
        tasks.add(new Task("T002", "Budgeting", "Company Team Building budgeting", it));
        tasks.add(new Task("T003", "Hiring", "Hire new emplooyes for the IT department", hr));

        // Employees Objects
        employees.add(new Employee("E001", "Akel", it, seniorDev));
        employees.add(new Employee("E002", "Justine", it, itSupport));
        employees.add(new Employee("E003", "Matthew", accounting, accStaff));
        employees.add(new Employee("E004", "Onix", hr, hrOff));
        employees.add(new Employee("E005", "Shion", hr, hrStaff));

        while (true) {
            System.out.print("""
                    ====== COMPANY MANAGEMENT =====
                    1. Check Tasks
                    2. Check Employees
                    3. Add Task to Employees
                    4. Find Employee
                    5. Create Task
                    6. Exit
                    Choice:""");
            int dashBoard = input.nextInt();
            input.nextLine();

            switch (dashBoard) {
                case 1:
                    System.out.println("===== CURRENT EXISTING TAKS =====");
                    for (Task task : tasks) {
                        task.printTask();
                    }
                    break;
                case 2:
                    System.out.println("===== CHECK EMPLOYEES =====");
                    for (Employee employee : employees) {
                        employee.printEmployees();
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
                        System.out.println("Cannot find Task Id");
                        break;
                    }

                    if (employeeHolder.getDepartment() != taskHolder.getDepartment()) {
                        System.out.println("Task Assignment Failed!");
                        employeeHolder.getPosition().printPositionInfo();
                        break;
                    }

                    employeeHolder.assignTask(taskHolder);
                    break;
                case 4:
                    Employee findingEmployee = null;
                    System.out.println("===== FIND EMPLOYEE ======");
                    System.out.print("Find Employee ID: ");
                    String employeeID = input.nextLine();

                    for (Employee employee : employees) {
                        if (employeeID.equals(employee.getEmployeeId())) {
                            findingEmployee = employee;
                        }
                    }

                    if (findingEmployee == null) {
                        System.out.println("Employee Did not Found!");
                        break;
                    }

                    findingEmployee.printEmployees();
                    break;
                case 5:
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
                        System.out.println("Task ID already exists!");
                        System.out.println("Task creation will be cancelled. . .");
                        break;
                    }
 
                    System.out.print("Enter Task Name: ");
                    String newTaskName = input.nextLine();

                    System.out.print("Enter Task Description: ");
                    String newTaskDescription = input.nextLine();

                    System.out.print("Enter Department Requirement: ");
                    String newDepartment = input.nextLine();


                    Department departmentCreation = null;

                    for (Department department : departments) {
                        if (department.getDepartmentName().equals(newDepartment)) {
                            departmentCreation = department;
                        }
                    }

                    if (departmentCreation != null) {
                        Task taskCreation = new Task(newTaskID, newTaskName, newTaskDescription, departmentCreation);
                        tasks.add(taskCreation);
                        System.out.println("Successfully Added the Task!");
                        System.out.println("===== NEW TASK =====");
                        taskCreation.printTask();
                    } else {
                        System.out.println("Department " + newDepartment +" is currently not avaiable.");
                    }
                    break;
                case 6:
                    System.out.println("THANK YOU!");
                    return;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }


        }
    }
}
