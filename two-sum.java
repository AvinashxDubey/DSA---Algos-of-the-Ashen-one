class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<n; i++){
            int complement = target- nums[i];
            if(numMap.containsKey(complement)){
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}