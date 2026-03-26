import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int countOfNumbers = in.nextInt();

        int[] numbers = new int[countOfNumbers];

        int max = numbers[0];
        int secondMax = numbers[0];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            }
            else if (numbers[i] > secondMax && numbers[i] != secondMax) {
                secondMax = numbers[i];
            }
        }

        System.out.println("\t========== RESULTS ==========");
        for (int num : numbers) {
            System.out.print(num + "\t");
            Thread.sleep(250);
        }
        System.out.println("\nMax Number: " + max);
        Thread.sleep(800);
        System.out.println("SecondMax Number: " + secondMax);
        Thread.sleep(800);
        System.out.println("Count of Even: " + even);
        Thread.sleep(800);
        System.out.println("Count of Odd: " + odd);
        
        

        
    }
}
