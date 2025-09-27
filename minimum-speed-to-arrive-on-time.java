class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right=10000000;  //speed cant be out of range [1, 10^7]
        int ans=-1;
        while(left<=right){
            int speed = left + (right-left)/2;
            if(validSpeed(dist, speed, hour)){
                ans=speed;
                right = speed-1;
            }
            else{
                left = speed+1;
            }
        }
        return ans;
    }

    private boolean validSpeed(int[] dist, int speed, double hour){
        double totalTime = 0;
        for(int i=0; i<dist.length-1; i++){
            totalTime += Math.ceil((double)dist[i]/speed);
        }
        totalTime+=(double)dist[dist.length-1]/speed;
        return totalTime<=hour;
    }
}