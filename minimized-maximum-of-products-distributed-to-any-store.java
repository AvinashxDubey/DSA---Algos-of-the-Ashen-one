class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        Arrays.sort(quantities);
        int left = 1, right = quantities[quantities.length-1];
        int ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(canGiveProds(quantities, mid, n)){
                ans = mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }

    public static boolean canGiveProds(int[] quantities, int maxProds, int n){
        int count=0;
        for(int quantity : quantities){
            count+= Math.ceil((double)quantity/maxProds);
            if(count>n) return false;
        }
        return true;
    }

}