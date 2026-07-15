import java.util.function.Consumer;
import java.util.List;

public class ConsumerWithCollection {
    public static void main(String[] args) {
        
        // step 1 Create a Consumer

        Consumer<Integer> square = n -> System.out.println("Square: " + n * n);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach(square);
    }
}