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

    public boolean removeTask(String id) {
        
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id cannot be empty or null!");
        }

        if (tasks.isEmpty()) {
            System.out.println("No Tasks available.");
            return false;
        }


        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equalsIgnoreCase(id)) {
                tasks.remove(i);
                return true;
            }
        }

        // i figure no need for boolean just straight print is just fine!
        return false;

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