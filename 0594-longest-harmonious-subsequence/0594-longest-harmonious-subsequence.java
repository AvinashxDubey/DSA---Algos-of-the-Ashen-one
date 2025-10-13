class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int lhs = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }  

        for(int num : nums){
            if(map.containsKey(num+1)){
                lhs = Math.max(lhs, map.get(num)+map.get(num+1));
            }
        }

        return lhs;
    }
}