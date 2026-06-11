public class Duplicates {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        int validCount = slow + 1;

        for (int i = 0; i < validCount; i++) {
            System.out.println(nums[i]);
        }

        
    }
}