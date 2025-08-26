class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int diff = Math.abs(b-x) - Math.abs(a-x);
            if(diff==0) return b-a;
            return diff;
        });
        for(int num : arr){
            maxHeap.offer(num);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        while(!maxHeap.isEmpty()){
            res.add(maxHeap.poll());
        }

        Collections.sort(res);
        return res;
    }
}