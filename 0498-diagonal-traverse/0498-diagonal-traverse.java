class Solution {
    /**
        look at the diagonals as tho they are rows
        traverse the matrix and all elements with value = i+j could be mapped together storing em in lists
        reverse these lists using a boolean to achieve the pattern
        and add the ele to the res array
     */
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m*n];
        int idx = 0;
        
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map.putIfAbsent(i+j, new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }

        boolean flip = true;
        for(List<Integer> ls : map.values()){
            if(flip){
                Collections.reverse(ls);;
            }
            flip=!flip;
            for(int num : ls){
                res[idx] = num;
                idx++;
            }
        }

        return res;
    }
}