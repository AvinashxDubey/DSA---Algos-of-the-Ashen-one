class Solution {
    /**
        Create result, currMax, currMin variable and assign first value of the arraynums[0].
        Now loop through the rest of array 1..n.
        Now check whether the element is positive or negative
        hence swap (since larger number becomes the smallest if it is negative).
        Find minimum tmin and maximum tmax respectively.
        Compare with the current result to obtain maximum.
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