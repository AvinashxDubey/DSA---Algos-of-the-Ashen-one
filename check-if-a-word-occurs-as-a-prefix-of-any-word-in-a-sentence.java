class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArr = sentence.split(" ");
        for(int i=1; i<=strArr.length; i++){
            if(strArr[i-1].startsWith(searchWord)){
                return i;
            }
        }
        return -1;
    }
}