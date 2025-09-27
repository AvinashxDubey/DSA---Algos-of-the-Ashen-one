class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                map.put(ch, i);
            }
            else if(!map.containsKey(ch)){
                map.put(ch, i);
            }
        }

        for(char ch : word.toCharArray()){
            if(!set.contains(ch) && map.get(ch)<map.getOrDefault(Character.toUpperCase(ch), -1)){
                count++;
                map.remove(ch);
                set.add(ch);
            }
        }
        return count;
    }
}