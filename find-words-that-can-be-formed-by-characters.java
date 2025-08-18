class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charMap = new int[26];
        int sum = 0;
        for (char ch : chars.toCharArray()) {
            charMap[ch - 'a']++;
        }

        for (String word : words) {
            int[] wordCharMap = new int[26];
            for (char ch : word.toCharArray()) {
                wordCharMap[ch - 'a']++;
            }
            boolean good = true;
            for(int i=0; i<26; i++){
                if(wordCharMap[i]>charMap[i]){
                    good = false;
                    break;
                }
            }
            if(good) sum+=word.length();
        }
        return sum;
    }
}