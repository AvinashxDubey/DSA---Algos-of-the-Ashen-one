class Solution {
    public char findTheDifference(String s, String t) {
        int m = s.length(), n =t.length();
        int count = 0;
        for(char ch : s.toCharArray()){
            count^=(int)ch;
        }

        for(char ch : t.toCharArray()){
            count^=(int)ch;
        }
        return (char)count;
    }
}