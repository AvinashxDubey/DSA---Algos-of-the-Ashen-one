class Solution {
    /**
        0 1   2     3     4     5     6
        0 1 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8...
        F(6) = F(5) + F(4) = 5+3 = 8
     */

    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fib(n-1) + fib(n-2);
    }
}