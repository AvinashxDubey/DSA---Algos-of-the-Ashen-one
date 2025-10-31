class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int idx = 0;

        for(int num : nums){
            if(set.contains(num)){
                ans[idx++] = num;
            }
            set.add(num);
        }

        return ans;
    }
}