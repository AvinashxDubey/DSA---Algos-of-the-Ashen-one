class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int i=nums.length-1; i>=0; i--){
            if(set.contains(nums[i])){
                count+=(i/3)+1;
                break;
            }
            set.add(nums[i]);
        }
        
        return count;
    }
}