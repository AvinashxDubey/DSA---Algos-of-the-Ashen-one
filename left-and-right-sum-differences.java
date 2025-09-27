class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int leftSum=0;
        for(int i=1; i<n; i++){
            answer[i]+=answer[i-1]+nums[i-1]; //leftsum
        }
        int[] rightSum=new int[n];
        for(int i=n-2; i>=0; i--){
            rightSum[i]+=rightSum[i+1]+nums[i+1];  //rightSum
        }

        for(int i=0; i<n; i++){
            answer[i] = Math.abs(answer[i]-rightSum[i]); 
        }
        return answer;
    }
}