class Solution {
    int totalXorOfSubsets;
    public int subsetXORSum(int[] nums) {
        backtrack(0, 0, nums);
        return totalXorOfSubsets;
    }

    private void backtrack(int index, int xor, int[] nums){
        if(index==nums.length){
            totalXorOfSubsets+=xor;
            return;
        }
        backtrack(index+1, xor^nums[index], nums);

        backtrack(index+1, xor, nums);
    }
}