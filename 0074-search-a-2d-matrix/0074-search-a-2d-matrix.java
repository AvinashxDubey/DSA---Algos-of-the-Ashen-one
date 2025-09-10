class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // we are gonna flatten the 2d matrix
        // using 0 to m*n-1 idx to traverse elements by
        // intuition: think of a hall with seats
        // the seatNo suggests two things
        // rowNo = seatNo/noOfSeatsPerRow and colNo = seatNo%noOfSeatsPerRow
        // row = idx/n and col=idx%n
        int low=0, up= m*n - 1;
        while(low<=up){
            int mid = low+(up-low)/2;
            int row = mid/n, col = mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                up = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}