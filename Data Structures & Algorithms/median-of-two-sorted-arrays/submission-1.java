class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] result=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                result[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                result[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            result[k]=nums2[j];
            j++;
            k++;
        }
        int l=0,r=result.length-1;
        int mid=(l+r)/2;
        if(result.length%2==0)
        {
            return (result[mid]+result[mid+1])/2.0;
        }
        else
        {
            return result[mid];
        }
    }
}
