class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;
    }

    public int findFirst(int[] nums,int target){
        int left=0, right=nums.length-1;
        int first =-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                first= mid;
                right= mid-1;  //continue checking towards the left
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return first;
    }

    public int findLast(int[] nums,int target){
        int left=0, right=nums.length-1;
        int last =-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                last= mid;
                left= mid+1;  //continue checking towards the right
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return last;
    }
}