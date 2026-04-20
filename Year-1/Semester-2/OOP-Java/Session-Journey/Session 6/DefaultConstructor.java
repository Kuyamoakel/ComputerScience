public class DefaultConstructor {
    int quantity;
    int age;

    String display() {
        return "Quantity: " + quantity + ", Age: " + age;
    }

    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();

        // if the program does not have constructor the compilier will provide a default constructor.
        System.out.println(obj1.display());
    }
}