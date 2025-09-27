class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += palindromeCount(s, i, i);  //odd length
            count += palindromeCount(s, i, i+1);
        }
        return count;
    }

    public int palindromeCount(String s, int start, int end){
        int count =0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }

}