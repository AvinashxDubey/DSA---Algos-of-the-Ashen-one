class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int l = -1;
        int r=0;
        while(r<nums.length){
            if(nums[r]==0){
                l = r;
                break;
            }
            r++;
        }

        if(l!=-1){
            ans+=r-l+1;
            r++;
        }
        while(r<nums.length){
            if(nums[r]==0){
                if(l==-1){
                    l=r;
                }
                ans+=r-l+1;
            } else{
                l=-1;
            }
            r++;
        }
        return ans;
    }
}