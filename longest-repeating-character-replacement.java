class Solution {
    public int characterReplacement(String s, int k) {
        int[] charMap = new int[26];
        
        int left = 0, maxFreq=0, maxLen=0;
        for(int right=0; right<s.length(); right++){
            charMap[s.charAt(right)-'A']++;
            //char which is most frequent currently
            maxFreq = Math.max(maxFreq, charMap[s.charAt(right)-'A']);

            while((right-left+1)-maxFreq>k){
                charMap[s.charAt(left)-'A']--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right-left+1);

        }

        return maxLen;
    }
}