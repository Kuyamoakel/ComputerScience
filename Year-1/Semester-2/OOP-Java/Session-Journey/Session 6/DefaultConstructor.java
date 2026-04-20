public class DefaultConstructor {
    int quantity;
    int age;

    String display() {
        return "Quantity: " + quantity + ", Age: " + age;
    }

    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();

        // Prints the returned string
        System.out.println(obj1.display());
    }
}