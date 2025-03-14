class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[k];

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // pq is used for finding top k frequent elements by sorting based on freq
        // we use pq and not treemap bcz treemap ignores elements with duplicate frequencies
        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        
        maxHeap.addAll(freq.entrySet());

        for(int i=0; i<k; i++){
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}