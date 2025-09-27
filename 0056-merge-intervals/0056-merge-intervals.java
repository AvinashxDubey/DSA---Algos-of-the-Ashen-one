class Solution {
    public int[][] merge(int[][] intervals) {
        /**
            sort the array based on starti
            create a list, and store first interval in it
            iterate over the array which gives current ele
            get the last interval which is the last ele in list
            if last[1]>=curr[0] then update last[1] = max(last[1], curr[1])
            else add curr to list
        */
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> ls = new ArrayList<>();
        ls.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] curr = intervals[i];
            int[] last = ls.get(ls.size()-1);

            if(last[1]>=curr[0]){
                last[1] = Math.max(last[1], curr[1]);
            }
            else{
                ls.add(curr);
            }
        }

        return ls.toArray(new int[ls.size()][]);
    }
}