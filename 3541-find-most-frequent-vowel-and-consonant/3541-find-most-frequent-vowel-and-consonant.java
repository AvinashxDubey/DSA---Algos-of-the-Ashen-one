class Solution {
    public int maxFreqSum(String s) {
        int maxVowelCt = 0;
        int maxConsCt = 0;
        int[] charMap = new int[26];
        for(char ch : s.toCharArray()){
            int idx = ch-'a';
            charMap[idx]++;
            if(idx==0 || idx==4 || idx==8 || idx==14 || idx==20){
                maxVowelCt = Math.max(maxVowelCt, charMap[idx]);
            } else{
                maxConsCt = Math.max(maxConsCt, charMap[idx]);
            }
        }
        return maxVowelCt + maxConsCt;
    }
}