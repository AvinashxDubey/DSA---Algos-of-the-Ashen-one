class Solution {
    /**
        few conditions to consider here:
        1. If target is negative and smallest nums[i] is non-negative (or vice versa),
        no valid quadruplets can exist.
        2. After fixing first (i) and second (j) numbers, skip over duplicates
        to avoid repeated quadruplets in the result
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); 
        List<List<Integer>> res = new ArrayList<>();
        if(target<0 && nums[0]>=0) return res;
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1, l=nums.length-1;
                while(k<l){
                    int total = nums[i]+nums[j]+nums[k]+nums[l];
                    if(total==target){
                        res.add(Arrays.asList(nums[i], nums[j],nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }

                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    else if(total<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}