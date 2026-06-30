public class Main {
    public static void main(String[] args) {
        
        Planner planner = new Planner();

        planner.addTask("Akel", "awefaw", Priority.HIGH, Subject.CODING, "No", "JUNE 30", "JULY1");

        planner.displayTask();
    }
}