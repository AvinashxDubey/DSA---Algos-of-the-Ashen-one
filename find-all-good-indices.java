class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int[] preSum = new int[n];  //non-increasing count
        int[] postSum = new int[n]; //non-decreasing count
        Arrays.fill(preSum, 1);
        Arrays.fill(postSum, 1);
        for(int i=1; i<n; i++){
            if(nums[i-1]>=nums[i]){
                preSum[i] =preSum[i-1]+1;
            } 
        }

        for(int i=n-2; i>=0; i--){
            if(nums[i]<=nums[i+1]){
                postSum[i] =postSum[i+1]+1;
            } 
        }

        for(int i=k; i<n-k; i++){
            if(preSum[i-1]>=k && postSum[i+1]>=k){
                res.add(i);
            }
        }
        return res;
    }
}
