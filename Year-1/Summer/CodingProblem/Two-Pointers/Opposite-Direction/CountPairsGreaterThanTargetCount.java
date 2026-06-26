public class CountPairsGreaterThanTargetCount {
    public static void main(String[] args) {
        
        int[] num = {1, 2, 3, 4, 5};

        int target = 7;
        int counter = 0;

        int left = 0;
        int right = num.length - 1;

        while (left < right) {

            int sum = num[left] + num[right];

            if (sum > target) {
                counter++;
            }

            if (sum < target) {
                left++;
            } else {
                counter++;
                right--;
            }
        }

        System.out.println(counter);
    }
}