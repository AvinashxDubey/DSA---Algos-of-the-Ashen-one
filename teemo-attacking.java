class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int i = 0, n=timeSeries.length;
        while(i<n){
            if(i<n-1 && timeSeries[i]+duration>=timeSeries[i+1]){
                if(duration!=0) count+=timeSeries[i+1]-timeSeries[i];
            }
            else{
                count+=duration;
            }
            i++;
        }
        return count;
    }
}