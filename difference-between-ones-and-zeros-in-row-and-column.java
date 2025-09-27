class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[][] diff = new int[m][n];
        int[] rows = new int[m];
        int[] cols = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) rows[i]++;
                else if(grid[i][j]==0) rows[i]--;
            }
        }

        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                if(grid[i][j]==1) cols[j]++;
                else if(grid[i][j]==0) cols[j]--;
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                diff[i][j] = rows[i]+ cols[j];
            }
        }
        return diff;
    }
}