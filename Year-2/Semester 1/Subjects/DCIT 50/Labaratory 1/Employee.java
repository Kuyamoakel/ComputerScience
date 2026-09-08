public class Employee {
    private String employeeId;
    private String employeeName;
    private String department;
    private String position;
    private Task assignedTask; 

    public Employee(String employeeId, String employeeName, String department, String position, Task assignedTask) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.position = position;
        this.assignedTask = assignedTask;
    }

    // getters
    public String getEmployeeId() {
        return employeeId;
    }

    public Task getTask() {
        return assignedTask;
    }

    public void assignTask(Task task) {

        if (this.assignedTask != null) {
            System.out.println("ERROR: Already have Task");
            return;
        }

        this.assignedTask = task;
        System.out.println("Succesfully Assigned Task!.");
    }

    @Override 
    public String toString() {

        if (assignedTask == null) {
            return "\n===== Employee Infromation =====" +
               "\nEmployee ID: " + employeeId +
               "\nEmployee Name: " + employeeName +
               "\nDepartment: " + department +
               "\nPosition: " + position +
               "\n===== CURRENT TASK =====" +
               "\nCurrently no Task" +
               "\n========================";
        } else {
            return "\n===== Employee Infromation =====" +
               "\nEmployee ID: " + employeeId +
               "\nEmployee Name: " + employeeName +
               "\nDepartment: " + department +
               "\nPosition: " + position +
               "\n===== CURRENT TASK =====" +
               assignedTask.toString() + 
               "\n========================";
        }
    }


}
