class Solution {
    /**
        Again, kadane is the one to go
        if the nums[i] is now positive to negative or vice versa
        then swap currMaxProd with currMinProd
        since larger number becomes the smallest if nums[i] is negative and vice versa
     */
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMin = Math.min(nums[i], currMin * nums[i]);
            currMax = Math.max(nums[i], currMax * nums[i]);
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }

}