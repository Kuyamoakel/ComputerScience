public class TwoSumII {
    public static void main(String[] args) {
        
        int[] numbers = {-1, 0};

        TwoSum(numbers, -1);
    }
    static void TwoSum(int[] numbers, int target) {

        int right = numbers.length - 1;
        int left = 0;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("[" + (left + 1) + ", " + (right + 1) + "]");
                break;
            }

            if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}