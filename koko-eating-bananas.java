class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans =-1;
        while(left<=right){
            int speed = left + (right-left)/2;
            if(validEatingSpeed(piles, speed, h)){
                ans = speed;
                right = speed-1;
            }
            else{
                left = speed+1;
            }
        }
        return ans;
    }

    private boolean validEatingSpeed(int[] piles, int speed, int h){
        int totalTime = 0;
        for(int bananas : piles){
            totalTime += Math.ceil((double)bananas/speed);
        }
        return totalTime<=h;
    }
}