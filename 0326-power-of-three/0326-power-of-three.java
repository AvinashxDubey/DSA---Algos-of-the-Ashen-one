class Solution {
    public boolean isPowerOfThree(int n) {
        long value3 = 1;
        while(n>0 && value3<n){
            value3+=value3<<1;
        }
        return value3==n;
    }
}