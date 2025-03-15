class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        long max=0;
        
        List<int[]> pairList = new ArrayList<>();
        for(int i=0; i<n; i++){
            pairList.add(new int[] {nums1[i], nums2[i]});
        }

        pairList.sort((a,b) -> Integer.compare(b[1], a[1]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long sum=0;
        for(int i=0; i<n; i++){
            int num1 = pairList.get(i)[0];
            int num2 = pairList.get(i)[1];

            sum+=num1;
            minHeap.add(num1);

            if(minHeap.size()>k){
                sum-=minHeap.poll();
            }

            if(minHeap.size()==k){
                max = Math.max(max, (long)sum*num2);
            }
            
            
        }
        return max;
    }
}