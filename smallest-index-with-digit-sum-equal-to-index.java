class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sum =0;
            int val = nums[i];
            while(val>0){
                sum+=val%10;
                val/=10;
            }
            if(sum==i) return i;
        }
        return -1;
    }
}