class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res=original;
        while(set.contains(res)){
            res*=2;
        }
        return res;
    }
}