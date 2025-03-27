class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(i, t.indexOf(s.charAt(i)));
        }

        int permDiff =0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            permDiff+=Math.abs(e.getKey()-e.getValue());
        }
        return permDiff;
    }
}