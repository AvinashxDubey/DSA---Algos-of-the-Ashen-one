class Solution {
    public List<List<Integer>> generate(int numRows) {
        /**
            think of it like a sandwich with 1's on both sides
            and sum of prev rows' prev and curr element in between
         */
       List<List<Integer>> res = new ArrayList<>();
       for(int i=0; i<numRows; i++){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        for(int j=1; j<i; j++){
            ls.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        }
        if(i>0){
            ls.add(1);
        }
        res.add(ls);
       } 
       return res;
    }
}