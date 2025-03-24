class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
// -1 -100 3 99  
//step 1: 99 3 -100 -1 (reverse the whole arr)
//step 2: 3 99 -1 -100 (reverse the 0 to k-1 part) and then (reverse the k to n-1 part)
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}