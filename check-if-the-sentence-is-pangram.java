class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        Set<Character> charSet = new HashSet<>();
        for(char ch : sentence.toCharArray()){
            charSet.add(ch);
        }
        return charSet.size()==26;
    }
}