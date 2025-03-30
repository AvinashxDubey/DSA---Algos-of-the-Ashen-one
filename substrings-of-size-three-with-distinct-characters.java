class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
       int[] charMap = new int[26];
       int count=0;
      int distinct =0;
       int right=0;
       for(right=0; right<3; right++){
        if(charMap[s.charAt(right)-'a']==0) distinct++;
        charMap[s.charAt(right)-'a']++;
        
       } 

       if(distinct==3) count++;
        int left=0;
       while(right<s.length()){
        charMap[s.charAt(left)-'a']--;
        if(charMap[s.charAt(left)-'a']==0) distinct--;
        if(charMap[s.charAt(right)-'a']==0) distinct++;
        charMap[s.charAt(right)-'a']++;
        if(distinct==3) count++; 
        left++;
        right++;
       }
       return count;
    }
}