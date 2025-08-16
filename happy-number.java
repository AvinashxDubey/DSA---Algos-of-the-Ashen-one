class Solution {
    /**
        another example of floyds cycle detection algo
        in the loop if slow or fast become 1 anywhere return true
        otherwise return slow==1
        cz it could be the case that slow and fast become 1 at the same time
     */
    public boolean isHappy(int n) {
        int slow = getNextNum(n);
        int fast = getNextNum(getNextNum(n));
        while (slow != fast) {
            if(slow==1) return true;
            slow = getNextNum(slow);
            fast = getNextNum(getNextNum(fast));
        }
        return slow==1;
    }

    public int getNextNum(int n) {
        int sumSqDig = 0;
        while (n > 0) {
            sumSqDig += (n%10) * (n%10);
            n /= 10;
        }
        return sumSqDig;
    }
}