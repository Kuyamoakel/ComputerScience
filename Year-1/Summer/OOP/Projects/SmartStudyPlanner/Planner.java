import java.util.ArrayList;
import java.util.List;

class Planner {
    private final List<Task> tasks = new ArrayList<>();

    // now planner only provides data, not to print it to console.
    public List<Task> getTasks() {
        // to prevent .clear() direct access in code
        return List.copyOf(tasks);
    }

    public void addTask(Task task) {

        if (task == null) {
            throw new IllegalArgumentException("Task must not be null!");
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

        boolean removed = tasks.removeIf(task -> task.getId().equalsIgnoreCase(id));

        return removed;
    }   
}