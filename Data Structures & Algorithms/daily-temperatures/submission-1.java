class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++)
        {
            int count=0;
            for(int j=i+1;j<temperatures.length;j++)
            {
                count++;
                if(temperatures[i]<temperatures[j])
                {
                    result[i]=count;
                    break;
                }
               
            }
            
        }
        result[temperatures.length-1]=0;
        return result;
    }
}
