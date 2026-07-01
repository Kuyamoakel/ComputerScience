import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2, 4, 6}; 

        mergingArray(num1, 3, num2, 3);

        System.out.println(Arrays.toString(num1));

        // expected output [1, 2, 2, 3, 5, 6]
    }
    static void mergingArray(int[] num1, int m, int[] num2, int n) {

        int first = m - 1;
        int second = n - 1;
        int insert = m + n - 1;

        while (first >= 0 && second >= 0) {

            if (num1[first] > num2[second]) {

                num1[insert] = num1[first];
                first--;

            } else {

                num1[insert] = num2[second];
                second--;

            }
            insert--;
        }

        while (second >= 0) {
            num1[insert] = num2[second];

            second--;
            insert--;
        }
    }
}
