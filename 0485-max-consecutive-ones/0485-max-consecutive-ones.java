class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currOnes = 0;
        int maxOnes = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if((nums[i]==1)){
                currOnes++;
                maxOnes = Math.max(maxOnes, currOnes);
            }
            else{
                currOnes = 0;
            }
        }
        return maxOnes;
    }
}