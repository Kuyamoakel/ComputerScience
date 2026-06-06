public class P2FindTheIndex {
    public static void main(String[] args) {
        
        // Given:
        int [] nums = {8, 15, 23, 42, 7};
        int i;

        // Find the index of 42

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 42) {continue;}

            System.out.println(i);
            return;
        }   
        System.out.println("Not Found");
    }
}
