class Solution {
    /**
        xor of same bits is 0
        so for arr = [
            2,  10
                ^
            2,  10
               =00
                ^ 
            1   01
        ]
               =01 -> 1, which is the single no.
        so xor'ing each element 'ld give just the single ele
     */
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        return xor;
    }
}