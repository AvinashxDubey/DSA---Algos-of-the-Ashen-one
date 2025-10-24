class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int friend : friends){
            set.add(friend);
        }

        int[] res = new int[friends.length];
        int i = 0;

        for(int id : order){
            if(set.contains(id)){
                res[i++] = id;
            }
        }

        return res;
    }
}