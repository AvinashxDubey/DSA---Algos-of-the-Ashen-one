class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int i=0, j=0;
        int index=0;
        while(j<n){
            //remove unnecessary smaller elements from the dq
            //as we dont require the size of dq to be the same as sliding window
            while(!dq.isEmpty() && dq.peekLast()<nums[j]) dq.pollLast();
            //add new element to last
            dq.offerLast(nums[j]);
            //if sliding window size is less than k
            if(j-i+1==k){
                res[index++] = dq.peekFirst();
                if(dq.peekFirst()==nums[i]){
                    dq.pollFirst();
                }
                i++;
            }
            j++;
        }
        return res;
    }
}