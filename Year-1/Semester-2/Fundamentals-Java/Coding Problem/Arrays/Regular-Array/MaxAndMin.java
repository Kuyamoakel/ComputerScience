import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arry = {10, 30, 40, 20, 15, 50};

        int max = arry[0];
        int min = arry[0];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arry.length; i++) {

            if (arry[i] > max) {
                max = arry[i];
            }
            if (arry[i] < min) {
                min = arry[i];
            }
            if (arry[i] % 2 == 0) {
                even++;
            }
            if (arry[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
        System.out.println("Largest Number: " + max);
        System.out.println("LOwest Number: " + min);
    } 
}