class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<groupSizes.length; i++){
            int size = groupSizes[i];
            if(map.containsKey(size)){
                map.get(size).add(i);
            }
            else{
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                map.put(size, ls);
            }
        }
        for(Map.Entry<Integer, List<Integer>> e : map.entrySet()){
            groupSplitAdd(e.getKey(),e.getValue());
        }
        return res;
    }

    public void groupSplitAdd(int size, List<Integer> group){
        int index = 0;
        for(int i=0; i<group.size()/size; i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0; j<size; j++){
                ls.add(group.get(index++));
            }
            res.add(ls);
        }
    }
}