class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0;
        for(int i=0; i<n/2; i++){
            ans[idx++] = (i+1);
            ans[idx++] = -(i+1);
        }

        if(n%2==1){
            ans[n-1] = 0;
        }

        return ans;
    }
}