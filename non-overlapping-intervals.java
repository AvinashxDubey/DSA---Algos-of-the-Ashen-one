class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[1]-b[1]);
        System.out.println(Arrays.deepToString(intervals));
        int count = 0;
        int[] last = intervals[0];
        for(int i=1; i<intervals.length; i++){
            int[] curr = intervals[i];
            if(last[1]>curr[0]){
                count++;
            }
            else{
                last = curr;
            }
        }
        return count;
    }
}