class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(!mapS.containsKey(chS)){
                mapS.put(chS, i);
            }
            if(!mapT.containsKey(chT)){
                mapT.put(chT, i);
            }
            if(mapS.get(chS)!=mapT.get(chT)){
                return false;
            }
        }
        return true;
    }
}