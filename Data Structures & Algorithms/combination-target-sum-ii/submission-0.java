class Solution {
    List<List<Integer>> result;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(int[] candidates, int target, int i, List<Integer> curr, int total)
    {
        if(total == target)
        {
            result.add(new ArrayList(curr));
            return;
        }

        if(total > target || i == candidates.length)
        {
            return ;
        }

        curr.add(candidates[i]);

        dfs(candidates, target, i+1, curr, total+candidates[i]);

        curr.remove(curr.size()-1);

        while(i + 1 < candidates.length && candidates[i] == candidates[i+1])
        {
            i++;
        }

        dfs(candidates, target, i+1, curr, total);
    }
}
