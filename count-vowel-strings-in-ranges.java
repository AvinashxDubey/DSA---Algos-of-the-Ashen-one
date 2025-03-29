class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int[] preSum = new int[words.length+1];
        for(int i=0; i<words.length; i++){
            boolean check = vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1));
            preSum[i+1] = preSum[i] + (check? 1: 0);
        }
        int[] ans =new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int left = queries[i][0], right=queries[i][1];
            ans[i] = preSum[right+1] - preSum[left];
        }
        return ans;
    }
}