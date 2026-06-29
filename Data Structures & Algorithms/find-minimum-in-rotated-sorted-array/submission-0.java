class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0,right=n-1;
        int min=nums[n-1];
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<min)
            {
                min=Math.min(min,nums[mid]);
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return min;
    }
}
