class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, n=x;
        // if(x<0 || (x%10==0 && x!=0)){
        //     return false;
        // }
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev==x? true : false;
    }
}