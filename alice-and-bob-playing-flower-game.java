class Solution {
    /**
        this ques got some confusing desc
        lets say no of flowers in one lane is x and the other is y
        the total no of flowers will be x+y
        so now we need to calculate if Alice's turn is last
        Alice takes the first turn so he'd win on
        total = 1, 3, 5, 7, 9... i.e. odd no of flowers
        so while iterating just check if x+y % 2 ==0 and increase the count
     */
    public long flowerGame(int n, int m) {
        long oddN = (n+1)/2;
        long evenN = n/2;
        long oddM = (m+1)/2;
        long evenM = m/2;

        return oddN*evenM + evenN*oddM;
    }
}