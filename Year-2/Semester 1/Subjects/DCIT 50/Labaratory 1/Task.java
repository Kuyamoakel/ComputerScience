public class Task {
    private String taskId;
    private String taskName;
    private String taskDesc;
    private Department department;

    public Task(String taskId, String taskName, String taskDesc, Department department) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.department = department;
    }

    // Getters

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Department getDepartment() {
        return department;
    }

    public void printTask() {
        System.out.println("===== TASK INFORMATION =====");
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + taskName);
        System.out.println("Task Description: " + taskDesc);
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("==============================");
    }
}
