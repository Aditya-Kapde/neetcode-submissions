class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int p=1,zero=0;
        for(int i:nums)
        {
            if(i!=0)
            {
                p=p*i;
            } else
            {
                zero++;
            }
        }
        if(zero>1)
        {
            return new int[nums.length];
        }
        for(int j=0;j<nums.length;j++)
        {
            if(zero>0)
            {
                ans[j]=(nums[j]==0)?p:0;
            }
            else
            {
                ans[j]=p/nums[j];
            }
        }
        return ans;
        
    }
}  
