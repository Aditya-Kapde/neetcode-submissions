class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int s : stones)
        {
            minHeap.offer(-s);
        }

        while(minHeap.size()>1)
        {
            int a1=minHeap.poll();
            int a2=minHeap.poll();
            if(a2>a1)
            {
                minHeap.offer(a1-a2);
            }

        }
        minHeap.add(0);
        return Math.abs(minHeap.peek());
    }
}
