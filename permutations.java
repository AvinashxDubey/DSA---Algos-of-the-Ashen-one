class Solution {
    /**
        arr = [ 1 2 3 4]
        for i = idx = 1; 1 2 3 4
        at i = 1, 1 2 3 4
        at i = 2, 1 3 2 4
        at i = 3, 1 4 3 2 
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, res, 0);
        return res;
    }

    public void solve(int[] nums, List<List<Integer>> res, int idx){
        if(idx==nums.length){
            res.add(Arrays.stream(nums).boxed().toList());
        }
        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            solve(nums, res, idx+1);
            swap(nums, i, idx);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}