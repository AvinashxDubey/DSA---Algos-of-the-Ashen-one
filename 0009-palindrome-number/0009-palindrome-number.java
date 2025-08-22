class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, n=x;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev==x;
    }
}