class Solution {
    /**
        Simple enough
        create a map to track occurences of elements
        then create a minHeap storing the freqs
        iterate over the pq and freq less than or equal to k-removed
        and adding that freq into removed
        when freq becomes greater than k-removed we get outta the loop
        and return the size of the pq
     */
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int removed = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.addAll(map.values());
        
        while(!minHeap.isEmpty() && minHeap.peek()<=k-removed){
            removed+=minHeap.poll();
        }
        return minHeap.size();
    }
}