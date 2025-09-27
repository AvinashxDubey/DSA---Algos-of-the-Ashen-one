class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // for first element
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            //  if sum - k is in the map add no of times it occurs
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}