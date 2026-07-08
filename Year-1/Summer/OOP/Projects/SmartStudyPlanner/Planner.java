import java.util.ArrayList;
import java.util.List;

class Planner {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {

        if (task == null) {
            System.out.println("Invalid Task!");
            return;
        }
        
        tasks.add(task);
    }

    public void removeTask(Task task) {
    
        if (task == null) {
            System.out.println("Invalid Task!");
            return;
        }

        if (tasks.isEmpty()) {
            System.out.println("No Tasks Available!");
            return;
        }

        for (Task taskToRemove : tasks) {
            if (taskToRemove.getTitle().equalsIgnoreCase(task.getTitle())) {
                tasks.remove(taskToRemove);
            }
            else {
                System.out.println("Did not Found!");
            }

        }
    }

    public void displayTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No Tasks Avaialable!");
            return;
        }

        System.out.println("CURRENT TASK 📝");
        for(Task task : tasks) {
            System.out.println(task);
        }
    }
        
}