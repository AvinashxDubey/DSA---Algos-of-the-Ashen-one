class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int maxLen = 0;
        int l =0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0) zeroCount++;
            while(zeroCount>k){
                if(nums[l]==0) zeroCount--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}