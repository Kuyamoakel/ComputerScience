public class Noduplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 3, 4, 1, 6, 4, 3, 6, 3};

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicates = false;

            // at first this will not run becase it is still false 0 < 0 = false.
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    isDuplicates = true;
                    break;
                }
            }

        // the program will no go down if this is True;
        if (isDuplicates) {
            continue;
        }

        // i will get the numbers that have duplicates
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] == numbers[j]) {
                System.out.print(numbers[i] + " ");
                break;
            }
        }





        }
    }
}