public class Task {
    private String taskId;
    private String taskName;
    private String taskDesc;
    private String specialization;

    public Task(String taskId, String taskName, String taskDesc, String specialization) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.specialization = specialization;
    }

    // Getters

    public String getTaskId() {
        return taskId;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return 
               "\nTask ID: " + taskId + 
               "\nTask Name: " + taskName +
               "\nTask Description: " + taskDesc +
               "\nSpecialization: " + specialization +
               "\n---------------------------------------";

    }
}
