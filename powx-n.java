class Solution {
    /**
    if power is odd, ans = ans * x, n-=1
    if power is even, x = x * x, n/=2
    eg: 2**10
        10 is even, so x = 2*2=4, n=10/2=5  -> (2)^10 = (2^2)^5 = (4)^5
        5 is odd, so  ans = 1*4=4, n=5-1=4
        4 is even, so x = 4*4=16, n=4/2=2
        2 is even, so x = 16*16=256, n=2/2=1
        1 is odd , so ans= 4 * 256 = 1024, n=1-1=0
    */
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double ans = 1;
        double base=x;
        long exp = n;
        if(exp<0){
            exp=-exp;
        }
        // log n
        while(exp>0){ 
            if(exp%2==0){
                base=base*base;
                exp/=2;
            }
            else{
                ans = ans* base;
                exp-=1;
            }
        }
        if(n<0) ans = 1/ans;
        return ans;
    }
}