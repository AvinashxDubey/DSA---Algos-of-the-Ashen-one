class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int j=0;
        int newLen=1;//at least 1 element
        int freq=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[j] && freq<2){//why its not freq<3
                j++;
                nums[j]=nums[i];
                newLen++;
                freq++;
            }
            else if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                newLen++;
                freq=1;
            }
        }
        return newLen;
    }
}