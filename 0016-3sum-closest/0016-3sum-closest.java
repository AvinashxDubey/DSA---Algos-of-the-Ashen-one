class Solution {
    /**
        sort the array out and fix i and use two ptrs j & k to get the two other integers
        keep track of closestSum to target and compare it with currSum
        then closestSum will become the currSum if currSum is closer
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int j = i+1, k=nums.length-1;
            while(j<k){
                int currSum = nums[i] + nums[j] + nums[k];
                if(Math.abs(currSum-target)<Math.abs(closestSum-target)){
                    closestSum = currSum;
                }

                if(currSum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestSum;
    }
}