class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2!=0) return false;
        int target = sum/2;
        int n = nums.length;

        Boolean[][] dp = new Boolean[n+1][target+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = true;
        }

        for(int j=1; j<target+1; j++){
            dp[0][j] = false;
        }

        for(int i=1; i<n+1; i++){
            for(int j =1; j<target+1; j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}