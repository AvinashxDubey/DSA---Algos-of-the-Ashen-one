class Solution {
    public int lengthOfLastWord(String s) {
        int r = s.length() - 1;

        while (r >= 0 && s.charAt(r) == ' ')
            r--;

        int l = r;
        while (l >= 0 && s.charAt(l) != ' ')
            l--;

        return r - l;
    }
}