class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charMap = new char[26];
        for (char ch : s.toCharArray()) {
            charMap[ch-'a']++;
        }

        for (char ch : t.toCharArray()) {
            charMap[ch-'a']--;
        }

        for (int freq : charMap) {
            if (freq != 0)
                return false;
        }
        return true;
    }

}