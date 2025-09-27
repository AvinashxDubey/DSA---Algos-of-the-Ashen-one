class Solution {
    public int maxDepth(String s) {
        int maxNd = 0;
        int nd = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') nd++;
            else if(s.charAt(i)==')') nd--;
            maxNd = Math.max(maxNd, nd);
        }
        return maxNd;
    }
}