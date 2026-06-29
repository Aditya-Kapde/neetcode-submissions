class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
         int max = Arrays.stream(piles).max().getAsInt();
        int l=1,r=max;
        int ans=max;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(piles[i]%mid!=0)
                count+=(piles[i]/mid)+1;
                else
                count+=piles[i]/mid;
            }
            if(count<=h){
            ans=Math.min(ans,mid);
            r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return ans;
    }
}
