class Solution {
    public int splitArray(int[] nums, int k) {
        int ans=-1;
        int left = Arrays.stream(nums).max().getAsInt();  //min value could be max of nums
        int right = 0; //max value could be sum of all elements of nums
        for(int num : nums){
            right+=num;
        }

        while(left<=right){
            int mid = left + (right-left)/2;

            if(validSplit(nums, mid, k)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }

    private boolean validSplit(int[] nums, int mid, int k){
        int splitCount = 1;
        int numSum =0;

        for(int num : nums){
            if(numSum+num>mid){
                numSum=num;
                splitCount++;
                if(splitCount>k) return false;
            }
            else{
                numSum+=num;
            }
        }

        return true;
    }
}