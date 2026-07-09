import java.util.ArrayList;
import java.util.List;

class Planner {
    private final List<Task> tasks = new ArrayList<>();

    // now planner only provides data, not to print it to console.
    public List<Task> getTask() {
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

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equalsIgnoreCase(id)) {
                tasks.remove(i);
                return true;
            }
        }

        // i figure no need for boolean just straight print is just fine!
        return false;

    }   
}