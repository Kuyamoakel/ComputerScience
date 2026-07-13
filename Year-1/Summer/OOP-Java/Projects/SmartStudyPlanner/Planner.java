import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            return false;
        }

        return tasks.removeIf(task -> task.getId().equalsIgnoreCase(id));
    }

    public void updateTask(String id) {

        if (id == null ||  id.isBlank()) {
            throw new IllegalArgumentException("Id must not be null!");
        }

        if (tasks.isEmpty()) {
            return;
        }
    }

    private Optional<Task> findTaskById(String id) {
        return tasks.stream()
            .filter(task -> task.getId().equalsIgnoreCase(id))
            .findFirst();
    }

    public boolean updateTitle(String id, String title) {
        return findTaskById(id)
            .map(task -> {
                task.setTitle(title);
                return true;
            })
            .orElse(false);
    }

    public boolean updateDescription(String id, String description) {
        return findTaskById(id)
            .map(task -> {
                task.setDescription(description);
                return true;
            })
            .orElse(false);
    }

    public boolean updatePriority(String id, Priority priority) {
        return findTaskById(id)
            .map(task -> {
                task.setPriority(priority);
                return true;
            })
            .orElse(false);
    }

    public boolean updateSubject(String id, Subject subject) {
        return findTaskById(id)
            .map(task -> {
                task.setSubject(subject);
                return true;
            })
            .orElse(false);
    }

    public boolean updateDeadLine(String id, LocalDate deadline) {
        return findTaskById(id)
            .map(task -> {
                task.setDeadline(deadline);
                return true;
            })
            .orElse(false);
    }
}