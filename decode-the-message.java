class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> charMap = new HashMap<>();
        char c = 'a';
        for(char ch : key.toCharArray()){
            if(!charMap.containsKey(ch) && ch!=' '){
                charMap.put(ch, c++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : message.toCharArray()){
            if(ch==' '){
                sb.append(' ');
            }else{
                sb.append(charMap.get(ch));
            }
        }
        return sb.toString();
    }
}