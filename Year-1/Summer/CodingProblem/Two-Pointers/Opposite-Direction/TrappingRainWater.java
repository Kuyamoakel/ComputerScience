public class TrappingRainWater {
    public static void main(String[] args) {
     
        int[] height = {4, 2, 0, 3, 2, 5};

        System.out.println(trap(height));

    }
    static int trap(int[] height) {

        // pointers

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int totalWater = 0;

        while (left < right) {

            if (leftMax <= rightMax) {

                left++;

                if (leftMax < height[left]) {
                    leftMax = height[left];
                }
                else {
                    totalWater += leftMax - height[left];
                }

            }

            else {

                right--;

                if (rightMax < height[right]) {
                    rightMax = height[right];
                }
                else {
                    totalWater += rightMax - height[right];
                }

            }
        }

        return totalWater;
    }
}
