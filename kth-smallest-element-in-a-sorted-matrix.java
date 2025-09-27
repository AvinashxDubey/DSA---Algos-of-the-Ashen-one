class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==1) return matrix[0][0];
        int n=matrix.length;
        int[] flat = new int[n*n];
        for(int i=0; i<n*n; i++){
            flat[i] = matrix[i/n][i%n];
        }

        Arrays.sort(flat);
        return flat[k-1];
    }
}