class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length/2; i++){
            n+=nums[2*i];
        }
        int index=0;
        int[] res = new int[n];
        for(int i=0; i<nums.length/2; i++){
            for(int j=0; j<nums[2*i]; j++){
                res[index++]=nums[2*i+1];
            }
        }
        return res;
    }
}