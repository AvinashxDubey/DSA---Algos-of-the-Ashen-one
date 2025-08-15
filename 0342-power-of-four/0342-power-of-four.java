class Solution {
    /**  
        4       2
        0100    0010
        0011    0001
        0000    0000

        0100    0010
        1010    1010
        0000    0010
     */
    public boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n&0xAAAAAAAA)==0;
    }
}