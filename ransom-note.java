class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charMap = new int[26];
        for(char ch : magazine.toCharArray()){
            charMap[ch-'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(charMap[ch-'a']>0){
                charMap[ch-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}