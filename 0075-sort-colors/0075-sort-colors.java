class Solution {
    /**
        just separate the focus into three parts, left for 0, middle for 1 and right for 2
        we gon put 0s to left whenever found, ignore 1s and put 2s to right
        wed use three pointer approach to maintain the three states
     */
    public void sortColors(int[] nums) {
        int i=0, j=0, k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums, i, j);
                i++;
                j++;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                swap(nums, j, k);
                k--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}