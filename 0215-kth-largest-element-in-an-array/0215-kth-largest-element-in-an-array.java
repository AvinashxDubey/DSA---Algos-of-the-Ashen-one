class Solution {
    /** easy peasy
        use minHeap, store num and keep only upto k
        in the end just return the top of minHeap
        which would be the kth Largest elements
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size()>k) minHeap.poll();
        }
        return minHeap.poll();
    }
}