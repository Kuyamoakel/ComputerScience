public class P1FindTheNumber {
    public static void main(String[] args) {

        // Given
        int[] nums = {8, 15, 23, 42, 7};

        // Find: is 23 in the array?

        for (int num : nums) {
            if (num != 23) {continue;}
            
            System.out.println("Found");
            return;
        }
        System.out.println("Not Found");
    }
}