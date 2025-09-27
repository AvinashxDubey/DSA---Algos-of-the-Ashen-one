class Solution {
    public boolean isPalindrome(String s) {
        /**
            two pointer
            skip whats not a letter or digit
            keep coming from both sides and stop if lChar!=rChar
        */

        int l=0, r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            else{
                if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}