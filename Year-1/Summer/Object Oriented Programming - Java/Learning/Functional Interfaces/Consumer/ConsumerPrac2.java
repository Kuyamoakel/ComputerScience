import java.util.List;
import java.util.function.Consumer;

public class ConsumerPrac2 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Consumer<Integer> checkEvenOdd = n -> {
            System.out.println("Number: " + n);
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };

        number.forEach(checkEvenOdd);
    }
}