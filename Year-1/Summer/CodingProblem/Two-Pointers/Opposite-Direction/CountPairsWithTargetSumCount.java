public class CountPairsWithTargetSumCount {
    public static void main(String[] args) {

        // Count how many pairs equal the target.

        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int counter = 0;

        int right = nums.length - 1;
        int left = 0;

        while (left < right) {
            
            int sum = nums[right] + nums[left];

            if (sum == target) {
                counter++;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        System.out.println(counter);

    }
}