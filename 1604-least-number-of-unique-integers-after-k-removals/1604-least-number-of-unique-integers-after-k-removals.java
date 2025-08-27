class Solution {
    /**
        Simple enough
        create a map to track occurences of elements
        then create a pq storing key pairs of map based on least frequency
        iterate over the pq and remove elements with freq less than or equal to k-alreadyRemoved
        when freq becomes greater than that we get outta the loop
        and return the size of the pq
     */
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int removed = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        minHeap.addAll(map.entrySet());
        
        while(!minHeap.isEmpty()){
            if(minHeap.peek().getValue()<=k-removed){
                removed+=minHeap.peek().getValue();
                minHeap.poll();
            }
            else{
                break;
            }
        }
        return minHeap.size();
    }
}