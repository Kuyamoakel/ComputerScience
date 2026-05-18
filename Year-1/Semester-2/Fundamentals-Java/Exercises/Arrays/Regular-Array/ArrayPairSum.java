public class ArrayPairSum {
    public static void main(String[] args) {
        
        int[] array = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < array.length; i++) {
            // k start at i + 1 para mag compare siya every other element. tapos preventing narin yung duplicate
            for (int k = i + 1; k < array.length; k++) {

                int sum = array[k] + array[i];

                if (sum == target) {
                    System.out.println(array[k] + " + " + array[i] + " = " + sum);
                    return;
                }
            }
        }
    }
}