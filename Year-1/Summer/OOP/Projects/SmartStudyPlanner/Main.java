import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Planner planner = new Planner();

        Task task = new Task("Yes", "Yes", Priority.HIGH, Subject.CODING, LocalDate.of(2026, 7, 1));

        planner.addTask(task);

        planner.displayTasks();
    }
}