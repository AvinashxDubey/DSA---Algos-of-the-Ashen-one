class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascTri= new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                int value = pascTri.get(i-1).get(j-1) + pascTri.get(i-1).get(j);
                row.add(value);
            }
            if(i>0){
                row.add(1);
            }
            pascTri.add(row);
        }
        return pascTri;
    }
}