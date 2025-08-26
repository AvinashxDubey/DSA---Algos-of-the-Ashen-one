class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDigArea = Integer.MIN_VALUE;
        double maxDiagonal = Float.MIN_VALUE;
        for(int[] currDim : dimensions){
            double currDiagonal = Math.sqrt(currDim[0]*currDim[0] + currDim[1]*currDim[1]);
            if(currDiagonal>maxDiagonal || (currDiagonal == maxDiagonal && currDim[0] * currDim[1] > maxDigArea)){
                maxDiagonal = currDiagonal;
                maxDigArea = currDim[0]*currDim[1];
            }
        }
        return maxDigArea;
    }
}