class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length, i=n-2;
        //finding the pivot i.e. first smallest from right
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        //checking if the pivot exists
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);
    }
    public static void swap(int[] nums, int i1, int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start <end){
            swap(nums, start++, end--);
        }
    }
}