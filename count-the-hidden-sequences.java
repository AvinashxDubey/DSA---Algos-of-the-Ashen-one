class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int count=0;
        int maxDiffSum = 0;
        int minDiffSum  = 0;
        int[] prefix = new int[differences.length +1];
        for(int i=0; i<differences.length; i++){
            prefix[i+1] = prefix[i] + differences[i]; 
            maxDiffSum = Math.max(maxDiffSum, prefix[i+1]);
            minDiffSum = Math.min(minDiffSum, prefix[i+1]); 
        }

        for(int i=lower; i<=upper; i++){
            if(maxDiffSum+i<=upper && minDiffSum+i>=lower){
                count++;
            }
        }
        return count;
    }

}