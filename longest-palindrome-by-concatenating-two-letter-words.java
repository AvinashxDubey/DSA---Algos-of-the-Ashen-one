class Solution {
    public int longestPalindrome(String[] words) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            //finding reverse of curr string
            String rev = new StringBuilder(word).reverse().toString();
            //checking if map contains rev of word and if its freq>0
            if(map.containsKey(rev) && map.get(rev)>0){
                ans+=4;
                map.put(rev, map.get(rev)-1);
            }
            else{
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }

        for(String word : map.keySet()){
            //check if word is symmetric
            if(word.charAt(0)==word.charAt(1) && map.get(word)>0){
                ans+=2;
                break;
            }
        }
        return ans;
    }
}