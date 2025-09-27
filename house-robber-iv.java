class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1, right= Arrays.stream(nums).max().getAsInt();
        int minCap=0;
        while(left<=right){
            int cap = left + (right-left)/2;
            if(validCapacity(nums, cap, k)){
                minCap = cap;
                right=cap-1;
            }
            else{
                left=cap+1;
            }
        }
        return minCap;
    }

    private boolean validCapacity(int[] nums, int cap, int k){
        int n = nums.length;
        int count=0;
        // greedy approach
        int i=0;
        while(i<n){  
            if(nums[i]<=cap){
                count++;
                i+=2;
            }
            else{
                i++;
            }
            if(count>=k) return true;
        }
        return false;
    }
}