class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int num : nums)
        {
            queue.offer(-num);
        }

        while(k>1)
        {
            queue.poll();
            k--;
        }
        return (-1)*queue.poll();
    }
}
