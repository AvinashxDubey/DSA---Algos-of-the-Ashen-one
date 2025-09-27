class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int evenCount =0;
        for(int num : nums){
            if(num%2==0)evenCount++;
        }

        int index=0, jindex=evenCount;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                res[index++]=nums[i];
            }
            else{
                res[jindex++]=nums[i];
            }
        }
        return res;
    }
}