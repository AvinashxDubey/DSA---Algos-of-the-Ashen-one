class Solution {
    public int maxFreqSum(String s) {
        Set<Integer> set = new HashSet<>();

        set.add('a'-'a');
        set.add('a'-'e');
        set.add('a'-'i');
        set.add('a'-'o');
        set.add('a'-'u');

        int maxVowelCt = 0;
        int maxConsCt = 0;
        int[] charMap = new int[26];
        for(char ch : s.toCharArray()){
            charMap[ch-'a']++;
            if(set.contains('a'-ch)){
                maxVowelCt = Math.max(maxVowelCt, charMap[ch-'a']);
            } else{
                maxConsCt = Math.max(maxConsCt, charMap[ch-'a']);
            }
        }
        return maxVowelCt + maxConsCt;

    }
}