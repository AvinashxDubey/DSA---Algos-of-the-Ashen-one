class Solution {
    public int arrangeCoins(int n) {
        int rowSize=0, completeRows=0;
        int left = 1, right=n;
        while(left<=right){
            long mid = left + (right-left)/2;
            long coins = mid * (mid+1)/2;
            if(coins==n){
                return (int)mid;
            }
            else if(coins<n){
                left = (int)mid+1;
            }
            else{
                right = (int)mid-1;
            }
        }
        return right;    
    }
}