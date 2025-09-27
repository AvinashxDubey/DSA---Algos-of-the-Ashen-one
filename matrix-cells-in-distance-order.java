class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<List<Integer>> manhattan = new ArrayList<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int dist = Math.abs(i-rCenter) + Math.abs(j-cCenter);
                manhattan.add(Arrays.asList(i, j, dist));
            }
        }
        manhattan.sort((a, b)-> a.get(2)-b.get(2));
        
        int[][] ans = new int[manhattan.size()][2];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j]=manhattan.get(i).get(j);
            }
        }
        
        return ans;
    }
}