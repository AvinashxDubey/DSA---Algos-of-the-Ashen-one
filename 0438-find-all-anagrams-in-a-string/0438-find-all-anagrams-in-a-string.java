class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length(), n2 = p.length();
        if(n1<n2) return new ArrayList<>();
        int[] sMap = new int[26];
        int[] pMap = new int[26];
        List<Integer> res = new ArrayList<>();
        int l = 0;
        for (int r = 0; r < n2; r++) {
            sMap[s.charAt(r) - 'a']++;
            pMap[p.charAt(r) - 'a']++;
        }

        if (Arrays.equals(sMap, pMap))
            res.add(l);

        for (int r = n2; r < n1; r++) {
            sMap[s.charAt(l) - 'a']--;
            l++;
            sMap[s.charAt(r) - 'a']++;

            if(Arrays.equals(sMap, pMap)) res.add(l);
        }
        return res;
    }
}