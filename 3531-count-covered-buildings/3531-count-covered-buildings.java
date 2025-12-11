class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int covered = 0;
        Map<Integer, TreeSet<Integer>> xCol = new HashMap<>();
        Map<Integer, TreeSet<Integer>> yRow = new HashMap<>();

        for(int[] coord : buildings){
            xCol.computeIfAbsent(coord[0],  key -> new TreeSet<>()).add(coord[1]);
        }

        for(int[] coord : buildings){
            yRow.computeIfAbsent(coord[1],  key -> new TreeSet<>()).add(coord[0]);
        }

        for(int[] coord : buildings){
            int x = coord[0], y = coord[1];

            TreeSet<Integer> col = xCol.get(x);
            TreeSet<Integer> row = yRow.get(y);

            Integer left = row.lower(x);
            Integer right = row.higher(x);
            Integer up = col.higher(y);
            Integer down = col.lower(y);
            
            if(left!=null && right!=null && up!=null && down!=null){
                covered++;
            }
        }

        return covered;
    }
}