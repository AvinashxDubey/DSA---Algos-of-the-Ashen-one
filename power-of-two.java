class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        //8 is a power of two and 8 in bcd is 1000 while 7 is 0111
        //so 8 & 7 = 0 which implies n & n-1 ==0 then n is a power of two
        return (n & (n-1)) == 0;
    }
}