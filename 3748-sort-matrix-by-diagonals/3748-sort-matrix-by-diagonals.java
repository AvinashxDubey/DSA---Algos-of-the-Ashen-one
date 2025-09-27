class Solution {
    /**
        [
             0 1 2             i-j
          0 [1 7 3],        [0 -1 -2],
          1 [9 8 2],   ->   [1  0 -1],
          2 [4 5 6]         [2  1  0]
        ]

        we gon use the map to store list
        containing elements with same i-j key
     */
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = grid.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int diag = i-j;
                map.putIfAbsent(diag, new ArrayList<>());
                map.get(diag).add(grid[i][j]);
            }
        }

        // now sorting bottom-left in non-increasing and
        // top-right in non-decreasing order
        // we do the opp so that we could remove from the lists end O(1) later and add it to grid array
        // which is more optimal than start O(n)

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> ls = entry.getValue();
            if(entry.getKey()>=0){
                ls.sort(Comparator.naturalOrder());
            }
            else{
                ls.sort(Comparator.reverseOrder());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int diag = i-j;
                List<Integer> ls = map.get(diag);
                grid[i][j] = ls.remove(ls.size()-1);
            }
        }

        return grid;
    }
}