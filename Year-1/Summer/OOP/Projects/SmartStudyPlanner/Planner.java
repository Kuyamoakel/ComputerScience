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

    public void removeTask(String id) {

        boolean isFound = false;
        
        if (tasks.isEmpty()) {
            System.out.println("No Tasks Avaialable!");
            return;
        }

        if (id == null) {
            System.out.println("Invalid ID!");
            return;
        }

        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                isFound = true;
                tasks.remove(task);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Task not found.");
            return;
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