class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        for (int num : nums) {
            nSet.add(num);
        }
        int l = 0;
        for (int num : nSet) {
            // Only start counting if 'num' is the beginning of a sequence.
            if (!nSet.contains(num - 1)) {
                int le = 1;  // length of current consecutive sequence
                while (nSet.contains(num + le)) {
                    le++;
                }
                l = Math.max(l, le);  // update the maximum length found so far
            }
        }
        return l;
    }
}
