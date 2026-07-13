import java.util.List;
import java.util.function.Consumer;

public class ConsumerPrac3 {
    public static void main(String[] args) {
        List<String> usernames = List.of("Akel", "Steph", "Aira", "Solomon");
        
        Consumer<String> display = name -> System.out.println("User: " + name);

        usernames.forEach(display);
    }
}