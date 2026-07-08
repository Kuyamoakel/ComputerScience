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
        
        if (id == null || id.isBlank()) {
            System.out.println("Invalid ID!");
            return;
        }

        if (tasks.isEmpty()) {
            System.out.println("No Tasks available.");
            return;
        }


        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equalsIgnoreCase(id)) {
                tasks.remove(i);
                return;
            }
        }

        // i figure no need for boolean just straight print is just fine!
        System.out.println("Task not found.");

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