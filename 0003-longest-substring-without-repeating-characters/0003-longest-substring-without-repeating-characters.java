class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        //hashmap to keep track of the indices of last character
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0; //current substring start
        
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            //check if char exists already in the map
            if(map.containsKey(ch)){
                //update the start of substring to prev index of char + 1
                //while handling the case like abba
                left = Math.max(left, map.get(ch)+1);
            }

            //update the index of the character in map
            map.put(ch, right);
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}