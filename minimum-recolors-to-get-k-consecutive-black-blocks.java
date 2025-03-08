class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left =0, right =0;
        int n = blocks.length();
        int op = 0;

        for(right=0; right<k; right++){
            if(blocks.charAt(right)=='W') op++;
        }
        
        int minOp = op;
        while(right<n){
            if(blocks.charAt(left)=='W') op--;
            if(blocks.charAt(right)=='W') op++;
            left++;
            right++;
            minOp = Math.min(op, minOp);
        }
        return minOp;
    }
}