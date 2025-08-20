class Solution {
    class Pairs {
        int[] point;
        double dist;

        Pairs(int[] point, double dist) {
            this.point = point;
            this.dist = dist;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pairs> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b.dist, a.dist));
        for(int[] point : points){
            double dist = Math.sqrt((point[0]*point[0] + point[1]*point[1]));
            Pairs pair = new Pairs(point, dist);
            maxHeap.offer(pair);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[][] ans = new int[maxHeap.size()][2];
        int i=0;
        while(!maxHeap.isEmpty()){
            ans[i] = maxHeap.poll().point;
            i++;
        }

        return ans;
    }
}