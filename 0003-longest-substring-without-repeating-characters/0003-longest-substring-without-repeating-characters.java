class Solution {
    /**
     bbaxya

    
     */
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxLen  = 0;
        for(int r = 0; r<s.length(); r++){
            while(!set.add(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}