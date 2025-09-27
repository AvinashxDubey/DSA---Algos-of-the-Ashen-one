class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        // prefix sum
        for(int i=1; i<n; i++){
            cardPoints[i]+=cardPoints[i-1];
        }

        if(n==k) return cardPoints[n-1];

        int minSubSum=cardPoints[n-k-1];
        for(int i=n-k; i<n; i++){
            minSubSum = Math.min(minSubSum, cardPoints[i]-cardPoints[i-(n-k)]);
        }

        return cardPoints[n-1]-minSubSum;
    }
}