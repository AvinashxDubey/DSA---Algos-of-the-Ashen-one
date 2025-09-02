class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consOne = 0, res=0, n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                consOne++;
                res=Math.max(res, consOne);
            }
            else{
                consOne=0;
            }
        }
                   
        return res;
    }
}