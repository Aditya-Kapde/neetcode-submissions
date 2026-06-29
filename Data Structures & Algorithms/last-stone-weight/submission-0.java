class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> list=new ArrayList<>();
        for(int num : stones)
        {
            list.add(num);
        }
        while(list.size()>1)
        {
            Collections.sort(list);
            int last = list.get(list.size() - 1);
            int secondLast = list.get(list.size() - 2);

            if(last > secondLast)
            {
                list.set(list.size() - 1, last - secondLast);
                list.remove(list.size() - 2);
            }
            else   
            {
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
            }
            
        }
        if(list.size()==1)
        {
            return list.get(0);
        }
        return 0;
    }
}
