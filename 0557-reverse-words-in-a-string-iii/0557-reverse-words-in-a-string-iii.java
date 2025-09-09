class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\s");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            res.append(sb);
            if(i<arr.length-1) res.append(' ');
        }
        return res.toString();
    }
}