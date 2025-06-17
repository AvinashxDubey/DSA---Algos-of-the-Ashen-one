class Solution {
    // recursion + memoizaton approach
    // there are only two choice for the player at each step
    // either right (i, j+1) or bottom (i+1, j)
    int[][] memo = new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int[] arr : memo){
            Arrays.fill(arr, -1);
        }
        return solve(0, 0, m, n);
    }

    public int solve(int i, int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }

        if(memo[i][j]!=-1) return memo[i][j];

        if(i==m-1 && j==n-1){   // reached bottom right corner
            return 1;
        }

        int right = solve(i, j+1, m, n);
        int down = solve(i+1, j, m, n);

        return memo[i][j] = right+down;
    }
}