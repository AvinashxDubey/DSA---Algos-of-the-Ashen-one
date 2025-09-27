class Solution {
    /**
        sliding window could be used to shrink the sliding window when currProd>=target
        if currProd<target for a window, thered be r-l+1 no of subarrays meeting the condition
        for eg: given arr = [10, 5, 2, 6], (target) k = 100
                for l=1, r=3, where 5*2*6 =60, the window would be
                5 2 6 => [6], [2, 6], [5, 2, 6] which equals 3
                and can be caluclate as r-l+1 = 3-1+1 = 3
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int currProd = 1;
        int count =0;
        int l=0;
        for(int r=0; r<n; r++){
            currProd*=nums[r];
            while(l<=r && currProd>=k){
                currProd/=nums[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}