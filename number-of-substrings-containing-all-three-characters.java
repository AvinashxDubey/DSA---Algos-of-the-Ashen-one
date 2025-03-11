class Solution {
    public int numberOfSubstrings(String s) {
        int[] charMap = new int[3];
        int left=0, res=0, n=s.length();
        for(int right=0; right<n; right++){
            charMap[s.charAt(right)-'a']++;

            while(charMap['a'-'a']>0 && charMap['b'-'a']>0 && charMap['c'-'a']>0){
                res+=n-right;
                charMap[s.charAt(left++)-'a']--;
            }

        }
        return res;
    }
}