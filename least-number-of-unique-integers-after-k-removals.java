class Solution {
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