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
        if(n==1) return true;

        if(n==0 || n%4!=0){
            return false;
        }

        return isPowerOfFour(n/4);
    }
}