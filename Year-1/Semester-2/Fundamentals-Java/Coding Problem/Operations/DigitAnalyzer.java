import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter positive integers: ");
        int numbers = in.nextInt();

        int sum = 0;
        int largest = 0; 
        int count = 0;
        while (numbers > 0) {
            int digit = numbers % 10; //extact muna ng last number...

            sum += digit; // para ma sum up yung digits na pumapasok isa isa

            count++; // increment ng count

            if (digit > largest) { // finding the highest number
                largest = digit;
            }

            numbers = numbers / 10; // aalisin yung last number sa list. so hindi man siya String na isa isa parin siya.

        }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Length: " + count);   

        in.close();
    }
}