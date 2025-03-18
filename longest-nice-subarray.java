class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int maxNice = 1;
        int left = 0;
        int andVal =0;
        for(int right=0; right<n; right++){
            while((andVal&nums[right])!=0){
                andVal^=nums[left];
                left++;
            }

            andVal|=nums[right];
            maxNice = Math.max(maxNice, right-left+1);
        }
            
        return maxNice;
    }
}