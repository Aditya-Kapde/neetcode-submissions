class MedianFinder {
    ArrayList<Integer> nums;

    public MedianFinder() {
        nums = new ArrayList<>();
    }
    
    public void addNum(int num) {
        nums.add(num);
        Collections.sort(nums);
    }
    
    public double findMedian() {
        if(nums.size()%2!=0)
        {
            return (double)nums.get((nums.size()-1)/2);
        }
        else
        {
            int x=nums.get(nums.size()/2);
            int y=nums.get(nums.size()/2-1);
            return (double)(x+y)/2;
        }
    }
}
