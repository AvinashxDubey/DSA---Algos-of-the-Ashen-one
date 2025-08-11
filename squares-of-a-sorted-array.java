class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSq = new int[nums.length];
        int l=0, r=nums.length-1;
        int i=nums.length-1;
        while(l<=r){
            int lSq = nums[l]*nums[l];
            int rSq = nums[r]*nums[r];
            
            if(lSq>rSq){
                sortedSq[i--] = lSq;
                l++;
            }
            else{
                sortedSq[i--] = rSq;
                r--;
            }
        }
        return sortedSq;
    }
}