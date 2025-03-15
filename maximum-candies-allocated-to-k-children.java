class Solution {
    public int maximumCandies(int[] candies, long k) {
        if(Arrays.stream(candies).asLongStream().sum()<k) return 0;
        int left=1, right=Arrays.stream(candies).max().getAsInt();
        int max=0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(validDist(candies, mid, k)){
                max=mid;
                left = mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return max;
    }

    private boolean validDist(int[] candies, int mid, long k){
        long count=0;
        for(int pile : candies){
            count += pile/mid;
            if(count>=k) return true;
        }
        return false;
    }
}