class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[][] maxRC = new int[grid.length][2];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                maxRC[i][0] = Math.max(maxRC[i][0], grid[i][j]);
                maxRC[i][1] = Math.max(maxRC[i][1], grid[j][i]);
            }
        }
        int maxSum=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j]<maxRC[i][0] && grid[i][j]<maxRC[j][1]){
                    maxSum+= Math.min(maxRC[i][0], maxRC[j][1])-grid[i][j];
                }
            }
        }
        return maxSum;
    }
}