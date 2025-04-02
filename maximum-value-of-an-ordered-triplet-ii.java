class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxLen = 0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1], nums[i]);
            suffix[n-1-i] = Math.max(suffix[n-i], nums[n-1-i]);
        }

        for(int i=1; i<n-1; i++){
            maxLen = Math.max(maxLen, (long)(prefix[i-1]-nums[i])*suffix[i+1]);
        }
        return maxLen;
    }
}