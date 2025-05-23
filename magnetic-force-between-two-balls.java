class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length-1]-position[0];
        int ans =-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(canPlaceBalls(position, mid, m)){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }

    public static boolean canPlaceBalls(int[] position, int minForce, int m){
        int count = 1;
        int xPos = position[0];
        for(int i=1; i<position.length; i++){
            if(position[i]-xPos>=minForce){
                count++;
                xPos = position[i];
            }
            if(count==m) return true;
        }
        return false;
    }
}