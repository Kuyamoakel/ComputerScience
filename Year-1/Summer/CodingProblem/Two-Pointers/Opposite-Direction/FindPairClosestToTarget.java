public class FindPairClosestToTarget {
    public static void main(String[] args) {
        
        int[] nums = {1, 3, 5, 8, 10};
        int target = 12;

        int left = 0;
        int right = nums.length - 1;

        int bestLeft = nums[left];
        int bestRight = nums[right];
        int bestDistance = Integer.MAX_VALUE;
        int currentDistance = 0; 
        
        while (left < right) {
            int sum = nums[left] + nums[right];
                
            if (sum < target) {
                currentDistance = target - sum;
                if (currentDistance <= bestDistance) {
                    bestDistance = currentDistance;
                    bestLeft = nums[left];
                    bestRight = nums[right];
                }
                left++;
            } else {
                currentDistance = sum - target;
                if (currentDistance <= bestDistance) {
                    bestDistance = currentDistance;
                    bestLeft = nums[left];
                    bestRight = nums[right];
                }
                right--;
            }
        }
        
        int newSum = bestLeft + bestRight;
        System.out.println(bestLeft + " + " + bestRight + " = " + newSum);
    }
}