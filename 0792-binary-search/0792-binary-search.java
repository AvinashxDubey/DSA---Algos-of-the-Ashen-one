class Solution {
    public int search(int[] nums, int target) {
        int low = 0, up= nums.length-1; 
        while(up>=low){
            int mid= (up+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                up = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
        }
        return -1;
    }
}