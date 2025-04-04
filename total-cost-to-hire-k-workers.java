class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<int[]> minHeapL = new PriorityQueue<>(
        (a,b)-> a[0]!=b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        PriorityQueue<int[]> minHeapR = new PriorityQueue<>(
        (a,b)-> a[0]!=b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        long totalCost=0;
        int n=costs.length, left = 0, right= n-1, count=0;
        for(left=0; left<candidates && left<=right; left++){
            minHeapL.offer(new int[] {costs[left], left});
        }
        for(right=n-1; right>=n-candidates && left<=right; right--){
            minHeapR.offer(new int[] {costs[right], right});
        }
        while(count<k){
            if(!minHeapL.isEmpty() && (minHeapR.isEmpty() || minHeapL.peek()[0]<=minHeapR.peek()[0])){
                totalCost+=minHeapL.poll()[0];
                count++;
                if(left<=right){
                    minHeapL.offer(new int[] {costs[left], left++});
                }
            }
            else{
                totalCost+=minHeapR.poll()[0];
                count++;
                if(left<=right){
                    minHeapR.offer(new int[] {costs[right], right--});
                }
            }
        }

        return totalCost;
    }
}