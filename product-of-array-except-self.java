class Solution {
    /**
        simple prefix sum eg
        lets take the eg [1 2 3 4]
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n+1];
        // prefix would be [1 1 2 6 doesnt matter]
        int[] suffix = new int[n+1];
        // suffix would be [doesnt matter 24 12 4 1]
        prefix[0] = 1;
        suffix[n] = 1;  
        // going from left to right
       for(int i=1; i<=n; i++){
        prefix[i] = prefix[i-1] * nums[i-1];
       }

       for(int i=n-1; i>=0; i--){
        suffix[i] = suffix[i+1] * nums[i];
       }

       for(int i=0; i<n; i++){
        ans[i] = prefix[i] * suffix[i+1];
       }
        
        return ans;
    }
}