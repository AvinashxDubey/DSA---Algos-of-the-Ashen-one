class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        List<Integer> ls = new ArrayList<>();

    if(s.length()<p.length()) return ls;

        int left=0, right=0;
        for(right=0; right<n; right++){
            sCount[s.charAt(right)-'a']++;
            pCount[p.charAt(right)-'a']++;
        }
     
        while(right<s.length()){
            if(equalCharFreq(left, s, p, sCount, pCount)){
                ls.add(left);
            }
            sCount[s.charAt(left)-'a']--;
            sCount[s.charAt(right)-'a']++;
            left++;
            right++;
            
        }

        if(equalCharFreq(left, s, p, sCount, pCount)){
                ls.add(left);
            }
        return ls;
    }

    private boolean equalCharFreq(int start, String s, String p, int[] sCount, int[] pCount){
        for(int i=start; i<start+p.length(); i++){
            if(sCount[s.charAt(i)-'a']!=pCount[s.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}