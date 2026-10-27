import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Company company = new Company();
        ArrayList<Position> positions = new ArrayList<>();

        // Departments Objects
        Department it = new Department("DOO1", "Information Technology");
        Department accounting = new Department("DOO2", "Accounting");
        Department hr = new Department("DOO3", "Human Resources");
        
        company.addDepartment(it);
        company.addDepartment(accounting);
        company.addDepartment(hr);
        
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

        company.addTask(new RegularTask("T001", "Debugging", "Need to center a div", it));
        company.addTask(new RegularTask("T002", "Budgeting", "Company Team Building budgeting", it));
        company.addTask(new RegularTask("T003", "Hiring", "Hire new emplooyes for the IT department", hr));

        // Employees Objects
        company.addEmployee(new Employee("E001", "Akel", it, seniorDev));
        company.addEmployee(new Employee("E002", "Justine", it, itSupport));
        company.addEmployee(new Employee("E003", "Matthew", accounting, accStaff));
        company.addEmployee(new Employee("E004", "Onix", hr, hrOff));
        company.addEmployee(new Employee("E005", "Shion", hr, hrStaff));

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
                    System.out.println("1. Regular Task");
                    System.out.println("2. Urgent Task");
                    System.out.println("3. Project Task");
                    System.out.println("4. ALL TASK");
                    System.out.print("Choice: ");
                    int checkTaskChoices = input.nextInt();
                    input.nextLine();

                    switch (checkTaskChoices) {
                        case 1:
                            boolean foundRegular = false;
                            for (Task t : company.getTasks()) {
                                if (t instanceof RegularTask) {
                                    RegularTask regular = (RegularTask) t;
                                    regular.printTask();
                                    foundRegular = true;
                                }
                            }
                            if (!foundRegular) {
                                    System.out.println("=======================");
                                    System.out.println("Currently No Task!");
                                }
                            break;
                        case 2:
                            boolean foundUrgent = false;
                            for (Task t : company.getTasks()) {
                                if (t instanceof UrgentTask) {
                                    UrgentTask urgentTask = (UrgentTask) t;
                                    urgentTask.printTask();
                                    foundUrgent = true;
                                }
                            }
                            if (!foundUrgent) {
                                    System.out.println("=======================");
                                    System.out.println("Currently No Task!");
                                }
                            break;
                        case 3:
                            boolean foundProject = false;
                            for (Task t : company.getTasks()) {
                                if (t instanceof Project) {
                                    if (t instanceof Project) {
                                        Project project = (Project) t;
                                        project.printTask();
                                        foundProject = true;
                                    } 
                                }
                            }
                            if (!foundProject) {
                                    System.out.println("=======================");
                                    System.out.println("Currently No Task!");
                                }
                            break;
                        case 4:
                            company.checkTasks();
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===== CHECK EMPLOYEES =====");
                    for (Employee employee : company.getEmployees()) {
                        employee.printEmployees();
                    }
                    break;
                case 3:
                    System.out.println("===== ADD TASK TO EMPLOYEE =====");
                    
                    System.out.print("Find Emplyoee: ");
                    String findEmployee = input.nextLine();
                    
                    Employee employeeHolder = company.findEmployee(findEmployee);

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

                    Task taskHolder = company.findTask(taskID);

                    if (taskHolder == null) {
                        System.out.println("Cannot find Task Id");
                        break;
                    }

                    employeeHolder.assignTask(taskHolder);
                    break;
                case 4:
                        System.out.println("===== FIND EMPLOYEE ======");
                        System.out.print("Find Employee ID: ");
                        String employeeID = input.nextLine();
                        
                        Employee findingEmployee = company.findEmployee(employeeID);;

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

                    Task result = company.findTask(newTaskID);

                    if (result != null) {
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

                    for (Department department : company.getDepartments()) {
                        if (department.getDepartmentName().equals(newDepartment)) {
                            departmentCreation = department;
                        }
                    }
                    
                    if (departmentCreation == null) {
                        System.out.println("Department " + newDepartment +" is currently not avaiable.");
                        break;
                    }

                    System.out.println("==== TASK SELECTION ====");
                    System.out.println("1. Regular Task");
                    System.out.println("2. Urgent Task");
                    System.out.println("3. Project Task");
                    System.out.print("Choice: ");
                    
                    int taskSelection = input.nextInt();
                    input.nextLine();

                    switch (taskSelection) {
                        case 1:
                            company.addTask(new RegularTask(newTaskID, newTaskName, newTaskDescription, departmentCreation));
                            System.out.println("Regular Task Succesfully Added!");
                            break;
                        case 2:
                            System.out.print("Enter Priority Level of the Task (1-10): ");
                            int priorityLevel = input.nextInt();
                            input.nextLine();

                            if (priorityLevel >= 0 && priorityLevel <= 10) {
                                company.addTask(new UrgentTask(newTaskID, newTaskName, newTaskDescription, departmentCreation, priorityLevel));
                                System.out.println("Urgent Task Succesfully Added!");
                                break;
                            } else {
                                System.out.println("Invalid Priority Level");
                            }
                            break;
                        case 3:
                            System.out.print("Enter Project Name: ");
                            String projectName = input.nextLine();

                            company.addTask(new Project(newTaskID, newTaskName, newTaskDescription, departmentCreation, projectName));
                            System.out.println("Project Task Succesfully Added!");
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            break;
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
