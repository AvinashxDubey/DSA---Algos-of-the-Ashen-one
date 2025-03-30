class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int preSum=0;
        int totalSum = 0;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            totalSum+=nums[i];
        }

        for(int i=0; i<n; i++){
            int leftSum = i*nums[i] - preSum; //abs diff from left for nums[i]
            int rightSum = (totalSum-preSum-nums[i]) - (n-i-1) * nums[i];  //abs diff from right side for nums[i]
            result[i] = leftSum + rightSum;
            preSum+=nums[i];
        }
        return result;
    }
}