public class MissingNumber {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4};
        int n = 5;
        
        System.out.println(findMissing(numbers, n));
        
        
    }
    public static int findMissing(int[] arr, int n) {
        int sum = 0;
        int sumOfNumber = 0;
        int nothing = -1;
        boolean isFound = false;

        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        for (int i = 0; i < n - 1; i++) {
            sumOfNumber += arr[i];
        }
        int MissingNumber = sum - sumOfNumber;
        int InitialResult = MissingNumber + sumOfNumber;
        
        if (InitialResult == sum) {
            isFound = true;
        } else {
            return nothing;
        }

        return MissingNumber;


    }
}