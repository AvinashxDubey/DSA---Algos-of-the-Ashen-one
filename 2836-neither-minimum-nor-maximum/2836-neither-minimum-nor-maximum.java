class Solution {
    /**
        kinda feels like cheating \U0001f602
        maybe check other submissions
     */
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        return nums[0]+nums[1]+nums[2]-(min+max);
    }
}