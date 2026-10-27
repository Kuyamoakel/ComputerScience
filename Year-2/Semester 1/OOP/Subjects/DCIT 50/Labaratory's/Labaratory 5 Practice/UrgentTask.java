public class UrgentTask extends Task {

    private int priorityLevel;


    public UrgentTask(String taskId, String taskName, String taskDesc, Department department, int priorityLevel) {
        super(taskId, taskName, taskDesc, department);
        this.priorityLevel = priorityLevel;
    }

    // getters
    public int getPriorityLevel() {
        return priorityLevel;
    }
    
    @Override
    public void printTask() {
        super.printTask();
        System.out.println("Priority Level: " + priorityLevel);
    }
}