class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int count  = 0;
        double maxAvg = Integer.MIN_VALUE;
        int sum = 0;
        int l = 0;
        for(int r=0; r<nums.length; r++){
            sum+=nums[r];
            count++;
            if(count==k){
                maxAvg = Math.max(maxAvg, 1.0*sum/k);
                sum-=nums[l];
                count--;
                l++;
            }
        }
        return maxAvg;
    }
}