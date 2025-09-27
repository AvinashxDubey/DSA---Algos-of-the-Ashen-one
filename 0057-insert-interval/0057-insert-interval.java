class Solution {
    /**
        Two intervals [a1, a2] and [b1, b2] overlap if
        max(a1, b1) <= min(a2, b2)
        to get intuition of why the overlapping conditions in while loops
        take the eg: intervals[i] = [12, 16], newInterval = [3, 10]
        when we check 16>=3 => theres a possibilty of overlapping
        but when we check for 12<=10, it becomes clear that they arent overlapping
        if newInterval was like [3, 13] instead then they could be overlapping cz 12<=13
        ------------------------------------------------
        the approach is simple, we just separately deal with
        left non overlapping part, then middle overlapping part,
        then right non overlapping part
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ls = new ArrayList<>();
        int n = intervals.length;
        
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            ls.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0], intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ls.add(newInterval);

        while(i<n){
            ls.add(intervals[i]);
            i++;
        }

        return ls.toArray(new int[ls.size()][2]);
    }
}