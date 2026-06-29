class Solution {
    public int maxArea(int[] heights) {
        int maxvolume = 0;
        for (int i = 0; i < heights.length; i++) { 
            for (int j = i + 1; j < heights.length; j++) { // Fixed typo here
                int volume = (Math.min(heights[i], heights[j])) * (j - i);
                maxvolume = Math.max(maxvolume, volume);
            }
        }
        return maxvolume;
    }
}
