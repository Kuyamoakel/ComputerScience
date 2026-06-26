public class FindPairSum {
    public static void main(String[] args) {

        
        int[] nums = {1, 2, 3, 4, 6, 8, 11};

        int target = 10;
        int left = 0;
        int right = nums.length - 1;
        boolean isFound = false;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (target == sum) {
                System.out.println(isFound = true);
                System.out.println(nums[left] + " + " + nums[right] + " = " + sum);
                return;
            }

            if (target > sum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(isFound);

    }
}