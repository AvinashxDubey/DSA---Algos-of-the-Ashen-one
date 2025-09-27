class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] minRow = new int[matrix.length];
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            minRow[i] = matrix[i][0];
            for(int j=0; j<matrix[0].length; j++){
                minRow[i] = Math.min(minRow[i], matrix[i][j]);
            }
        }

        for(int j=0; j<matrix[0].length; j++){
            int maxInCol = 0;
            for(int i=0; i<matrix.length; i++){
                maxInCol = Math.max(maxInCol, matrix[i][j]);
            }

            for(int i=0; i<matrix.length; i++){
                if(matrix[i][j]==maxInCol && matrix[i][j]==minRow[i]){
                    res.add(maxInCol);
                }
            }
        }
        return res;
    }
}