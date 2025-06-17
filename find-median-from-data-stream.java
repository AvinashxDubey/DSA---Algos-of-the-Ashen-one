class MedianFinder {
    /**
        [1, 3, 5, 4, 8]
        we create two heaps maxHeap and minHeap
        maxHeap             minHeap
        1
        1                   3
        1 3                 5  (cz maxHeap can only have at most 1 more element than minHeap)
        1 3                 4 5
        1 3 4               5 8 (maxHeap.length can be minHeap.length+1, not vice versa)
        median is (maxHeap.poll()+minHeap.poll())/2 = (4+5)/2=9/2=4.5
    */
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)-> b-a);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>num){
            maxHeap.offer(num);
        }
        else{
            minHeap.offer(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.isEmpty()) return maxHeap.peek();
        int n = maxHeap.size() + minHeap.size();
        double ans=0;
        if(n%2==0){
            ans = 1.0*(maxHeap.peek() + minHeap.peek())/2;
        }
        else{
            ans = maxHeap.peek();
        }
        return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */