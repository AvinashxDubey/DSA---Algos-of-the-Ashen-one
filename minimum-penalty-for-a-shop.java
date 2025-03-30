class Solution {
    public int bestClosingTime(String customers) {
        int minPenalty=Integer.MAX_VALUE, earlyHr=-1;
        int n = customers.length();
        int[] openSum = new int[n+1];
        int[] closeSum = new int[n+1];

        // incase of open, for i count all the 'N' from 0 to i-1
        for(int i=0; i<n; i++){
            openSum[i+1]=openSum[i]+ (customers.charAt(i)=='N'? 1: 0);
        }

        // incase of close, for i count all the 'Y' from i to n
        for(int i=n-1; i>=0; i--){
            closeSum[i]=closeSum[i+1]+ (customers.charAt(i)=='Y'? 1: 0);
        }

        for(int i=0; i<=n; i++){
            int penalty = openSum[i] + closeSum[i];
            if(penalty<minPenalty){
                minPenalty= penalty;
                earlyHr = i;
            }
        }
        return earlyHr;
    }
}