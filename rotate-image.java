class Solution {
    public void rotate(int[][] matrix) {
        // transpose the matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the matrix
        for(int i=0; i<matrix.length; i++){
            int start=0, end=matrix[0].length-1;
            while(start<=end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}