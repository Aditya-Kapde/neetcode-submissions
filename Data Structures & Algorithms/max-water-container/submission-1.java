class Solution {
    public int maxArea(int[] heights) {
        int maxvolume = 0;
        int l=0,r=heights.length-1;
        while(l<r)
        {
            int volume=(Math.min(heights[l],heights[r]))*(r-l);
            maxvolume=Math.max(maxvolume,volume);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxvolume;
    }
}
