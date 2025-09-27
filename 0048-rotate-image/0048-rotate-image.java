class Solution {
    public void rotate(int[][] matrix) {
        // reverse the rows
        int t = 0, b=matrix.length-1;
        while(t<b){
            int[] temp = matrix[t];
            matrix[t] = matrix[b];
            matrix[b] = temp;
            t++; b--;
        }

        // transpose the matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}