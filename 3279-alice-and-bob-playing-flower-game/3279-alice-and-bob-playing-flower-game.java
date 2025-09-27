class Solution {
    /**
        this ques got some confusing desc
        lets say no of flowers in one lane is x and the other is y
        the total no of flowers will be x+y
        so now we need to calculate if Alice's turn is last
        Alice takes the first turn so he'd win on
        total = 1, 3, 5, 7, 9... i.e. odd no of flowers
        how to calulate this without using nested for loop and getting a TLE?
        we can calculate odd and even no of elements in a range n by using ceiling div trick
        oddN = (n+1)/2 {to handle when n is odd}
        evenN = n/2
        --------------------------------------------------
        for getting valid no of pairs, wed return
        oddN*evenM + evenN*oddM
        i.e. odd no of elements in n * even no of elements in m + even no of elements in n * odd no of elements in m
     */
    public long flowerGame(int n, int m) {
        long oddN = (n+1L)/2;
        long evenN = n/2;
        long oddM = (m+1L)/2;
        long evenM = m/2;

        return oddN*evenM + evenN*oddM;
    }
}