import java.util.function.Consumer;

public class ConsumerPrac4 {
    public static void main(String[] args) {
        
        Consumer<String> database = data -> System.out.println("Saving Record: " + data);

        database.accept("Akel");
        database.accept("Steph");
        database.accept("Aira");
        database.accept("Solomon");
    }
}