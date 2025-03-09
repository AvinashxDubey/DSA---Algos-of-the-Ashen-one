class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        int left=0, right=0;
        for(right=0; right<s1.length(); right++){
            s1Count[s1.charAt(right)-'a']++;
            s2Count[s2.charAt(right)-'a']++;
        }

        if(Arrays.equals(s1Count, s2Count)) return true;

        while(right<s2.length()){
            s2Count[s2.charAt(left)-'a']--;
            s2Count[s2.charAt(right)-'a']++;
            left++;
            right++;
            if(Arrays.equals(s1Count, s2Count)) return true;
        }
        return false;
    }
}