class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        for(int p=1; p<n-2; p++){
            for(int q = p+1; q<n-1; q++){
                boolean inc1 = true;
                boolean dec = true;
                boolean inc2 = true;
                for(int i = 1; i<=p; i++){
                    if(nums[i]<=nums[i-1]){
                        inc1 = false;
                    }
                }
                for(int i = p+1; i<q+1; i++){
                    if(nums[i]>=nums[i-1]){
                        dec = false;
                    }
                }
                for(int i = q+1; i<n; i++){
                    if(nums[i]<=nums[i-1]){
                        inc2 = false;
                    }
                }
                if(inc1 && dec && inc2) return true;
            }
        }
        return false;
    }
}