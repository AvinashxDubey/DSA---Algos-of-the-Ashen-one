class Solution {
    /**
        0 1   2     3     4     5     6
        0 1 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8...
        F(6) = F(5) + F(4) = 5+3 = 8
     */
    public int fib(int n) {
        if(n==0) return 0;
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i<n+1; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }
}