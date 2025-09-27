class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1, right=Integer.MAX_VALUE;
        int ans=-1;
        while(left<=right){
            int divisor = left + (right-left)/2;
            if(validDivisor(nums, divisor, threshold)){
                ans = divisor;
                right = divisor-1;
            }
            else{
                left = divisor+1;
            }
        }
        return ans;
    }

    private boolean validDivisor(int[] nums, int divisor, int threshold){
        int totalDivisionSum=0;
        for(int num : nums){
            totalDivisionSum+=Math.ceil((double)num/divisor);
        }
        return totalDivisionSum<=threshold;
    }
}