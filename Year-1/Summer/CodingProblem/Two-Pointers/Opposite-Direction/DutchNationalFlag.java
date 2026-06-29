public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] colors = {2, 2, 1, 0, 0, 1, 2, 0};

        sortColors(colors);
    }
    static void sortColors(int[] colors) {
        // 3 pointers
        int current = 0;
        int right = 0;
        int left = colors.length - 1;

        while (current <= left) {

            if (colors[current] == 0) {
                // A must step to save the previous value in the array.
                int temp = colors[right];
                colors[right] = colors[current];
                colors[current] = temp;
                
                current++;
                right++;
            }

            else if (colors[current] == 1) {
                current++;
            }

            else {
                // Swapping
                int temp = colors[left];
                colors[left] = colors[current];
                colors[current] = temp;

                left--;
            }
        }
        
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }
} 