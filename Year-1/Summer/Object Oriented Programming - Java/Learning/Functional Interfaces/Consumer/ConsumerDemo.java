import java.util.List;
import java.util.function.*;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Akel", "Steph", "Kurt");

        Consumer<String> logger = name -> System.out.println("Logging: " + name);

        names.forEach(logger);
    }
}