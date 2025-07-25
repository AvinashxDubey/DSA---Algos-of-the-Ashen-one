class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0 && !set.contains(nums[i])){
                sum+=nums[i];
            }
            maxVal = Math.max(maxVal, nums[i]);
            set.add(nums[i]);
        }
        return sum<=0 ? maxVal : sum;
    }
}