import java.util.ArrayList;
import java.util.List;

class Planner {
    private List<Task> tasks = new ArrayList<>();


    public void addTask(String title, String description, Priority priority, Subject subject, String completed, String createdDate, String deadline) {
        Task task = new Task(title, description, priority, subject, completed, createdDate, deadline);
        tasks.add(task);
    }

    public void displayTask() {
        System.out.println("CURRENT TASK 📝");
        for(Task task : tasks) {
            System.out.println("- " + task);
        }
    }
        
}