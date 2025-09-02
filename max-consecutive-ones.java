class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currOnes = 0;
        int maxOnes = 0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]==0)){
                currOnes = 0;
            }
            else{
                currOnes++;
            }
            maxOnes = Math.max(maxOnes, currOnes);
        }
        return maxOnes;
    }
}