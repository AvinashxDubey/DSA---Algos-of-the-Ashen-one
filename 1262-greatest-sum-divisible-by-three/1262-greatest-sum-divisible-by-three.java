class Solution {
    /**
        we just need to keep track of the remainder 
        curr sum % 3 and at the end check if taking the element or leaving it gives out the max valid sum 
     */
    public int maxSumDivThree(int[] nums) {
        Integer[][] dp = new Integer[nums.length][3];
        return solve(nums, 0, 0, dp);
    }

    public int solve(int[] nums, int idx, int rem, Integer[][] dp){
        if(idx==nums.length){
            if(rem==0) return 0;
            return Integer.MIN_VALUE;
        }

        if(dp[idx][rem]!=null) return dp[idx][rem];
        
        int pick = nums[idx] + solve(nums, idx+1, (nums[idx]+rem)%3, dp);

        int notPick = solve(nums, idx+1, rem, dp);

        return dp[idx][rem] = Math.max(pick, notPick);
    }
}