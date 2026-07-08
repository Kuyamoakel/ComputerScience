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
        
        if (id == null || id.isBlank()) {
            System.out.println("Invalid ID!");
            return;
        }
        
        if (tasks.isEmpty()) {
            System.out.println("No Tasks available.");
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