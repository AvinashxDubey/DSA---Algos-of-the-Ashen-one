class Solution {
    public int scoreOfString(String s) {
        int l=0, r=1;
        int score=0;
        while(r<s.length()){
            score+=Math.abs(s.charAt(l++)-s.charAt(r++));
        }
        return score;
    }
}