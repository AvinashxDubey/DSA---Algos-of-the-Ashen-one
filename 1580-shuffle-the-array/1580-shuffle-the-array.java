class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int[] ans = new int[nums.length];
        int idx = 0;
        while(i<n){
            ans[idx] = nums[i];
            ans[idx+1] = nums[i+n];
            idx+=2;
            i++;
        }
        return ans;
    }
}