class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0) return new int[0];
        int[] result=new int[nums.length-k+1];
        int j=0,n=nums.length;
        for(int left=0, right=k-1;right<nums.length;left++, right++)
        {
            int max=nums[left];
            for(int i=left;i<=right;i++)
            {
                if(max<nums[i])
                {
                   max=nums[i];
                }
            }
           result[j++]=max;
        } 
        return result;
    }
}
