class Solution {
    /**
        we can't rob an adjacent house
        which means we're allowed to rob any non-adjacent house
     */
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return robHelper(nums, n-1, dp);
    }

    public int robHelper(int[] nums, int idx, int[] dp){
        if(idx<0) return 0;
        
        if(dp[idx]!=-1) return dp[idx];
        
        return dp[idx]=Math.max(nums[idx]+robHelper(nums, idx-2, dp), robHelper(nums, idx-1, dp));
    }
}