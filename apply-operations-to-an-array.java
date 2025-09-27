class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }

        int left = 0, right = 0;
        while(right<n){
            if(nums[left]!=0){
                left++;
            }
            else if(nums[right]!=0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j){
        nums[i] = nums[i]+nums[j];
        nums[j] = nums[i]-nums[j];
        nums[i] = nums[i]-nums[j];
    }
}