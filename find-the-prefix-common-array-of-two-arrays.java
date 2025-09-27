class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int[] numFreq = new int[A.length+1];
        int count=0;
        for(int i=0; i<A.length; i++){
            numFreq[A[i]]++;
            numFreq[B[i]]++;
            
            if(numFreq[A[i]]>=2){
                numFreq[A[i]]-=2;
                count++;
            }
            if(A[i]!=B[i] && numFreq[B[i]]>=2){
                numFreq[B[i]]-=2;
                count++;
            }
            res[i]=count;
        }
        return res;
    }
}