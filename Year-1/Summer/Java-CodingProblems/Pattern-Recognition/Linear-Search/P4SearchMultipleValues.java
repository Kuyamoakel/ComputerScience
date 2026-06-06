public class P4SearchMultipleValues {
    public static void main(String[] args) {
        
        // Given
        int[] nums = {5, 9, 12, 18, 25};

        isFound(9,nums);
        isFound(20,nums);
        isFound(25,nums);

    }
    public static void isFound(int number, int[] nums) {
        for (int num : nums) {
            if (num != number) {continue;}

            System.out.println(number + " -> " + "Found");
            return;
        }
        System.out.println(number + " -> " + "Not Found");
    }
}
