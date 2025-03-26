class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int n=words.length;
        int[][] charMap = new int[n][26];
        for(int i=0; i<words.length; i++){
            for(char ch : words[i].toCharArray()){
                charMap[i][ch-'a']++;
            }
        }
        for(char ch : words[0].toCharArray()){
            String chStr = String.valueOf(ch);
            boolean check = true;
            for(int i=0; i<words.length; i++){
                if(!words[i].contains(chStr) || charMap[i][ch-'a']<=0){
                    check=false;
                    break;
                }
                if(charMap[i][ch-'a']>0){charMap[i][ch-'a']--;}
            }
            if(check ) {
                res.add(chStr);
            }
        }
        return res;
    }
}