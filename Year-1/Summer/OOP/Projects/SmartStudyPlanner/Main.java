import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Planner planner = new Planner();

        Task task = new Task("Yes", "Yes", Priority.HIGH, Subject.CODING, LocalDate.of(2026, 8, 10));

        planner.addTask(task);

        planner.displayTasks();

        if (planner.removeTask("Sr330")) {
            System.out.println("Task removed.");
        }
        else {
            System.out.println("Task not found.");
        }

        planner.displayTasks();


    }
}