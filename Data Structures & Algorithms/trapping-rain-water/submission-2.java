class Solution {
    public int trap(int[] height) {
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;

            // Find the maximum height on the left side
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find the maximum height on the right side
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Water trapped at position i is determined by the minimum boundary height
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }
}
