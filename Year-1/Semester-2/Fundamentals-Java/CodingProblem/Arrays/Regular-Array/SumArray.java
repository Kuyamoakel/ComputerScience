public class SumArray {
    public static void main(String[] args) {
        
        int[] grades = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        System.out.println("Sum: " + sum);
    }
}
