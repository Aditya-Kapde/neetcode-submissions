class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        Stack<Double> stack=new Stack<>();
        double[][] car=new double[n][2];
        for(int i=0;i<n;i++)
        {
            car[i][0]=position[i];
            car[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(car, (a,b) -> Double.compare(b[0], a[0]));
        for(int j=0;j<n;j++)
        {
            double time=car[j][1];
            if(stack.isEmpty()||time>stack.peek())
            {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
