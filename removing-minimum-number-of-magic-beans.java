class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long minOp = Long.MAX_VALUE;
        long preSum=0;
        long totalSum=0;
        int n= beans.length;
        for(int bean : beans){
            totalSum+=(long)bean;
        }

        for(int i=0; i<n; i++){
            long beforeOp = preSum;
            long afterOp = (totalSum - preSum)- (long) (n-i) * beans[i];
            preSum+=(long)beans[i];
            
            minOp = Math.min(minOp, beforeOp+afterOp);
            if(i<n-1 && beans[i]==beans[i+1]) continue;
        }
        return minOp;
    }
}