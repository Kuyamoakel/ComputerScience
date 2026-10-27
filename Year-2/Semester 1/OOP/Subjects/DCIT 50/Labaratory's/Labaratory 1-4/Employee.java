public class Employee {
    private String employeeId;
    private String employeeName;
    private Department department;
    private Position position;
    private Task assignedTask; 

    public Employee(String employeeId, String employeeName, Department department, Position position) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.position = position;
        this.assignedTask = null;
    }

    // getters
    public String getEmployeeId() {
        return employeeId;
    }

    public Task getTask() {
        return assignedTask;
    }

    public void assignTask(Task task) {

        if (department.getDepartmentName() != task.getDepartment().getDepartmentName()) {
            System.out.println("Task Assignment Failed!");
            position.printPositionInfo();
            return;
        }

        if (this.assignedTask != null) {
            System.out.println("ERROR: Already have Task");
            return;
        }

        this.assignedTask = task;
        System.out.println("The Task " + task.getTaskName() + " is succesfully assigned to " + employeeName);
    }

    public Task getAssignedTask() {
        return assignedTask;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    public void printEmployees() {
        if (this.assignedTask == null) {
            System.out.println("===== Employee Information =====");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department: " + department.getDepartmentName());
            System.out.println("Position: " + position.getPositionName());
            System.out.println("====== CURRENT TASK =====");
            System.out.println("Currently No Task");
            System.out.println("=========================");
        } else {
            System.out.println("===== Employee Information =====");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department: " + department.getDepartmentName());
            System.out.println("Position: " + position.getPositionName());
            System.out.println("====== CURRENT TASK =====");
            assignedTask.printTask();
        }
        
    }
}
