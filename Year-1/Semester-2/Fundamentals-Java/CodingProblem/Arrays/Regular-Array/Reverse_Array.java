public class Reverse_Array {
    public static void main(String[] args) {
        
        int[] grades = {90, 80, 50, 70, 75, 86};

        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(grades[i] + " ");
        }
    }
}
