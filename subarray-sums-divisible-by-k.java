class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res=0, prefixSum=0;
        HashMap<Integer, Integer> remMap = new HashMap<>();
        remMap.put(0, 1); //valid for each k 
        for(int num : nums){
            prefixSum+=num;

            int remainder = prefixSum%k;

            if(remainder<0) remainder+=k;

            res += remMap.getOrDefault(remainder, 0);

            remMap.put(remainder, remMap.getOrDefault(remainder, 0)+1);
        }

        return res;
    }
}