class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // for tracking words2 max Freq of a char among all
        int[] maxCharFreq = new int[26];
        int[] tempCharFreq = new int[26];
        List<String> res = new ArrayList<>();

        for(String word : words2){
            Arrays.fill(tempCharFreq, 0);
            for(char ch : word.toCharArray()){
                tempCharFreq[ch-'a']++;
            }

            for(int i=0; i<26; i++){
                maxCharFreq[i] = Math.max(maxCharFreq[i], tempCharFreq[i]);
            }

        }


        for(String word : words1){
            Arrays.fill(tempCharFreq, 0);

            for(char ch : word.toCharArray()){
                tempCharFreq[ch-'a']++;
            }

            boolean isUniversal = true;

            for(int i=0; i<26; i++){
                if(tempCharFreq[i]<maxCharFreq[i]){
                    isUniversal = false;
                }
            }

            if(isUniversal){
                res.add(word);
            }
        }

        return res;
    }
}