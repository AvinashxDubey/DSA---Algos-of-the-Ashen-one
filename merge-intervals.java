class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ls = new ArrayList<>();
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        ls.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] last = ls.get(ls.size()-1);
            int[] curr = intervals[i];
            if(last[1]>=curr[0]){
                last[1] = Math.max(last[1], curr[1]);
                if(last[0]>curr[0]){
                    last[0] = curr[0];
                }
            }
            else{
                ls.add(curr);
            }
        }

        return ls.toArray(new int[ls.size()][]);
    }
}