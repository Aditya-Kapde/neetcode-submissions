class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] a=new int[2001];
        int[] ans=new int[k];
        int max=0,ind=0;
        for(int i=0;i<nums.length;i++)
        {
                a[nums[i]+1000]++;
        }
        for(int m=0;m<k;m++)
        {
            for(int z=0;z<2001;z++)
            {
                if(a[z]>max)
                {
                    max=a[z];
                    ind=z;
                }
            }
            ans[m]=ind-1000;
            a[ind]=0;
            max=ind=0;

        }
        return ans;

    }
}
