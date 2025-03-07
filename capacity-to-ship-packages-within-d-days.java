class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();

        int right = 0;
        for(int num: weights){
            right+=num;
        }
        int ans=-1;
        while(left<=right){
            int wtCapacity = left + (right-left)/2;
            if(possibleWeightCapacity(weights, wtCapacity, days)){
                ans=wtCapacity;
                right = wtCapacity-1;
            }
            else{
                left = wtCapacity+1;
            }
        }
        return ans;
    }

    private boolean possibleWeightCapacity(int[] weights, int wtCapacity, int days){
        int wtSum = 0;
        int totalDays = 1;

        for(int num : weights){
            if(wtSum+num>wtCapacity){
                wtSum = num;
                totalDays++;
                if(totalDays>days){
                    return false;
                }
            }
            else{
                wtSum+=num;
            }
        }
        return true;
    }
}