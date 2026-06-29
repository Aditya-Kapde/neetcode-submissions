class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] sorted = Arrays.copyOf(heights, n);
        Arrays.sort(sorted);
        int maxarea=0;
        for(int i=0;i<n;i++)
        {
            int min=sorted[i],area=0;
            int ca=0;
            for(int j=0;j<n;j++)
            {
                if(heights[j]>=min)
                {
                    ca+=min;
                    area=Math.max(area,ca);
                }
                else
                {
                    ca=0;
                }
            }
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}
