class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k) return 0;
        int maxSubstr = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq.get(ch)<k){
                return Math.max(longestSubstring(s.substring(0, i),k), longestSubstring(s.substring(i+1, s.length()), k));
            }
        }
        return s.length();
    }    
}