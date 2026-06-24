public class P3CountComparison {
    public static void main(String[] args) {
        
        // given
        int[] nums = {10, 20, 30, 40, 50};
        int counter = 0;

        // serach for 50: How many comparisons does linear search perform before finding it?
        for (int num : nums) {
            counter++;
            if (num != 50) {
                continue;
            }
            System.out.println("Searching: 50");
            System.out.println("Total Comparison for linear search perform before finding it is " + counter);
        }

    }
}
