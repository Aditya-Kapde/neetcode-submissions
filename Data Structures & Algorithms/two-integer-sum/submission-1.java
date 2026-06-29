class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++)
      {
        a.put(nums[i],i);
      }
      for(int j=0;j<nums.length;j++)
      {
        int d=target-nums[j];
        if(a.containsKey(d)&&a.get(d)!=j)
        {
            return new int[]{j,a.get(d)};
        }
      }
      return new int[0];
        
    }
}
