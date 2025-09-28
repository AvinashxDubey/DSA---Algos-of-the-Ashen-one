class Solution {
    /**
        we can climbe either 1 or 2 steps at a time
        so for n = 2, there are two ways to climb
        for n=3, thered be climbStairs(2)+climbstairs(1)
        generalising, climbstairs(n) = climbstairs(n-1)+climbstairs(n-2)
     */
    public int climbStairs(int n) {
        int[] dp = new int[46];
        Arrays.fill(dp, -1);
        return climbStairsHelper(n, dp);
    }

    public int climbStairsHelper(int n, int[] dp) {
        if (n <= 2) return n;
        
        if (dp[n] != -1) return dp[n];

        return dp[n] = climbStairsHelper(n - 1, dp) + climbStairsHelper(n - 2, dp);
    }
}