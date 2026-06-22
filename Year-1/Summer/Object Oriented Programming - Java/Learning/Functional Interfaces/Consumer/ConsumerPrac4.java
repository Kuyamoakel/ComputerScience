import java.util.function.Consumer;

public class ConsumerPrac4 {
    public static void main(String[] args) {
        
        Consumer<String> Processing = data -> System.out.println("Processing: " + data);
        Consumer<String> Completed = data -> System.out.println("Completed: " + data);
        Consumer<String> Combined = Processing.andThen(Completed);
        

        Combined.accept("Akel");
        Combined.accept("Steph");
        Combined.accept("Aira");
        Combined.accept("Solomon");

    }
}