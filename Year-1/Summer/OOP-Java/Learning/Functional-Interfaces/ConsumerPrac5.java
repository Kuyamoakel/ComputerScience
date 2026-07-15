import java.util.List;
import java.util.function.Consumer;

public class ConsumerPrac5 {
    static void processTask(String task, Consumer<String> callback) {
        callback = work -> System.out.println("Working on: " + task);
    }
    public static void main(String[] args) {
        
        processTask("Bible Reading");
    }
}