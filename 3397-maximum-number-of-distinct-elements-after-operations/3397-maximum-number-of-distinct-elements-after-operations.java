class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int pre = Integer.MIN_VALUE;

        for(int num : nums){
            int curr = Math.min(num+k, Math.max(num-k, pre+1));
            if(curr>pre){
                count++;
                pre = curr;
            }
        }

        return count;
    }
}