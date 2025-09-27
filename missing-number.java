class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]<nums.length && nums[i]!=i){
                swap(nums, nums[i], i);
            }
            else{
                i++;
            }
        }

        for(i=0; i<n; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }

    private void swap(int[] nums, int i, int j){
        int temp=0;
        temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}