class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int num : gifts){
            maxHeap.offer(num);
        }

        for(int i=0; i<k; i++){
            int maxGifts = maxHeap.poll();
            int sqrtGifts = (int) Math.sqrt(maxGifts);
            if(sqrtGifts>0) maxHeap.offer(sqrtGifts);
        }
        long remGifts = 0;
        while(!maxHeap.isEmpty()){
            remGifts+=maxHeap.poll();
        }

        return remGifts;
    }
}