class Solution {
    /**
        the problem is like dividing the arr into two subsets and
        getting their sum's diff = target
        count of such arrs would be the ans
        s1 + s2 = total_sum
        s1 - s2 = diff
       +   +      +
       ---------------------
       2*s1 = total_sum + diff
       s1 = (total_sum + diff)/2
       
     */
    public int findTargetSumWays(int[] nums, int target) {
        int total_sum = Arrays.stream(nums).sum();
        int sum_vals = total_sum+target;
        if(sum_vals%2!=0) return 0;
        if(sum_vals<0) return 0;
        int diff = sum_vals/2;

        int[][] t = new int[nums.length+1][diff+1];

        // for sum = 0 no element is required
        for(int i = 0; i<=nums.length; i++){
            t[i][0] = 1;
        }

        // for sum > 0 when theres no element 
        for(int i = 1; i<=diff; i++){
            t[0][i] = 0;
        }
        
        for(int i = 1; i<=nums.length; i++){
            for(int j = 0; j<=diff; j++){
                if(nums[i-1]==0){
                    t[i][j] = 2*t[i-1][j];
                } else if(nums[i-1]<=j){
                    t[i][j] = t[i-1][j] + t[i-1][j-nums[i-1]];
                } 
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[nums.length][diff];
    }    
}