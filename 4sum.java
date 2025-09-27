class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<4) return res;
        Arrays.sort(nums);
        if(target<0 && nums[0]>0) return res;
        if(nums[nums.length-1]<target/4) return res;
        // two outer loops for finding first and second element
        // we skip current element if currEle == prevEle
        // inside the loops we use two pointers to get third and fourth element
        // which helps us find elements efficiently
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k= j+1, l = nums.length-1;
                while(k<l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                    }
                    else if(sum<target){
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