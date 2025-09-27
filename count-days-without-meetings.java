class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b)->Integer.compare(a[0], b[0]));
        int lastEnd=0;
        int free = 0    ;
        for(int i=0; i<meetings.length; i++){
            if(meetings[i][0]>lastEnd+1){
                free+=meetings[i][0]-lastEnd-1;
            }
            lastEnd = Math.max(lastEnd, meetings[i][1]);
        }

        free+=days-lastEnd;
        return free;
    }
}