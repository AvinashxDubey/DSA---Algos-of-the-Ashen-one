class Solution {
    public String longestPalindrome(String s) {
        /**
            palindrome keeps expanding from either a central (odd no) single element
            or (even no) two elements
            so iterate over the string, at each idx check palindrome for both even and odd cases
            store max of two in maxLen
            whenver maxLen > prevLen i.e end-start+1
            we subtract (maxLen-1)/2 and add maxLen/2 to idx
            cz for even palindrome case with length 4, we only need to go 1 index back for start
            and 2 index ahead for end
            for odd plaindrome case with length 3, we need to go equal amounts back and front
         */
         
        int start=0, end=0;
        for(int i=0; i<s.length(); i++){
            int odd = countPalindromicLen(s, i, i);
            int even = countPalindromicLen(s, i, i+1);
            int maxLen = Math.max(odd, even);
            if(maxLen>end-start+1){
            start= i-(maxLen-1)/2;  //take example of an even array, youll understand why
            end = i + (maxLen)/2;
            }
        }
        return s.substring(start, end+1);
    }

    public int countPalindromicLen(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}