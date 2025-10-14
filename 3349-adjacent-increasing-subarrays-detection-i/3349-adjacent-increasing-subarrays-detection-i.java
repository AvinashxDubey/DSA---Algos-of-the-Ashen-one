class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0; i<=nums.size()-2*k; i++){
            if(isValid(nums, i, k)) return true;
        }

        return false;
    }


    public boolean isValid(List<Integer> nums, int start, int k){
        for(int i = start; i<start+k-1; i++){
            if(nums.get(i)>=nums.get(i+1)) return false;
        }

        for(int i = start+k; i<(start+(2*k)-1); i++){
            if(nums.get(i)>=nums.get(i+1)) return false;
        }
        return true;
    }
}