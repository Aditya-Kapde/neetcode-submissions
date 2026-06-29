class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len=tasks.length;
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;
        Arrays.sort(freq);
        
        ArrayList<Integer> arr=new ArrayList<>();
        for (int f : freq) if (f > 0) arr.add(f);
        Collections.sort(arr, Collections.reverseOrder());

        int maxVal = arr.get(0);
        int idleSlots = (maxVal - 1) * n;
        
        for (int i = 1; i < arr.size(); i++) {
            idleSlots -= Math.min(maxVal - 1, arr.get(i));
        }

        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;

    }
}
 