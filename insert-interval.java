class Solution {
    /**
        we just separately deal with left non overlapping part, then middle overlapping part,
        then right non overlapping part
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ls = new ArrayList<>();
        int i=0, n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            ls.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        ls.add(newInterval);

        while(i<n){
            ls.add(intervals[i]);
            i++;
        }

        int[][] ans = new int[ls.size()][];
        for(i=0; i<ls.size(); i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}