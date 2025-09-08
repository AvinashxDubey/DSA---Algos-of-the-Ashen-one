class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int l = 1, r = n;
        while(l<=r){
            if(l+r==n && hasNoZero(l) && hasNoZero(r)){
                ans[0] = l;
                ans[1] = r;
                break;
            }
            else if(l+r<n){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }

    public boolean hasNoZero(int n){
        while(n>0){
            if(n%10==0) return false;
            n/=10;
        }
        return true;
    }
}