class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int index=0, jindex=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                res[index] = nums[i];
                index+=2;
            }
            else{
                res[jindex] = nums[i];
                jindex+=2;
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}