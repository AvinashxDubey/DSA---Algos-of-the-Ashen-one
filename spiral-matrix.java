class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left =0, right=matrix[0].length-1;
        int top = 0, bottom=matrix.length-1;

        while(left<=right && top<=bottom){
            int temp1=left;
            while(temp1<=right){
                ans.add(matrix[top][temp1]);
                temp1++;
            }
            top++;
            int temp2 = top;
            while(temp2<=bottom){
                ans.add(matrix[temp2][right]);
                temp2++;
            }
            right--;
            int temp3=right;
            while(top<=bottom && left<=temp3){
                ans.add(matrix[bottom][temp3]);
                temp3--;
            }
            bottom--;
            int temp4=bottom;
            while(left<=right && top<=temp4){
                ans.add(matrix[temp4][left]);
                temp4--;
            }
            left++;
        }
        // System.out.println(ans);
        return ans;
    }
}