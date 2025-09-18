class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

        createSubsets(nums, 0, res, ls);
        return res;
    }

    public static void createSubsets(int[] nums, int idx, List<List<Integer>> res, List<Integer> ls){
        if(idx==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        
        // choose the curr num
        ls.add(nums[idx]);
        createSubsets(nums, idx+1, res, ls);
        
        // or not choose the curr num
        ls.remove(Integer.valueOf(nums[idx]));
        createSubsets(nums, idx+1, res, ls);
    }
}