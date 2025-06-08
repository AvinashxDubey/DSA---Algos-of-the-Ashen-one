class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // first we sort the array, to use two pointer approach
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum  = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1] && nums[k]==nums[k+1]){
                        j++;
                        k--;
                    }
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }
}