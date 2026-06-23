public class Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        // to get the width = right - left using the index
        // to get the height, just use the shortest wall.

        // water = width x shorter wall

        int right = height.length - 1;
        int left = 0;

        int width = 0;
        int shorterWall;
        int currentWater = 0;

        int maxWater = 0;

        while (left < right) {
            width = right - left;
            // calculates the width using index
            shorterWall = Math.min(height[left], height[right]);
            // in here we must get the shorterwall, to prevent spilling the water.
            currentWater = width * shorterWall;
            // here is the formula for current water

            if (currentWater > maxWater) {
                maxWater = currentWater;
            }

            // moving the taller wall cannot improve the height limiting; it only makes the width smaller.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxWater);

        // DIFFICUTLY FOR ME 9/10 HAHAHA;


    }
}