class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        // prefix sum
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }

        return Math.max(maxNoOverlapHelper(nums, firstLen, secondLen), maxNoOverlapHelper(nums, secondLen, firstLen));
    }

    private int maxNoOverlapHelper(int[] nums, int f, int s){
        int maxf = nums[f-1];
        int totalMax = nums[f+s-1];

        for(int i=f+s; i<nums.length; i++){
            maxf = Math.max(maxf, nums[i-s]-nums[i-s-f]);
            totalMax = Math.max(totalMax, maxf + nums[i]-nums[i-s]);
        }
        return totalMax;
    }
}