public class BonusChallange {
    public static void main(String[] args) {
        

        int[] nums = {8, 15, 23, 42, 7};

        System.out.println(contains(nums, 23));

    }
    public static boolean contains(int[] nums, int target) {
        
        for (int num : nums) {
            if (num != target) {continue;}

            return true;
        }
        return false;
    }
}
