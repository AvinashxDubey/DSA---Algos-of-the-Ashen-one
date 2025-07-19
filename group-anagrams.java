class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
            we use hashmap to store freqKey as key and anagrams as value
            then we just return the hasmaps values
         */
        Map<String, List<String>> map = new HashMap<>();
        int[] charMap = new int[26];

        for(String str : strs){
            Arrays.fill(charMap, 0);

            for(char ch : str.toCharArray()){
                charMap[ch-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int freq : charMap){
                sb.append(freq).append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}