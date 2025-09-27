class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length, count=0;
        List<Integer> res = new ArrayList<>();
        int[] beforeSum = new int[n];
        int[] afterSum = new int[n];
        for(int i=0; i<n-1; i++){
            if(security[i+1]<=security[i]){
                beforeSum[i+1]= beforeSum[i]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(security[i+1]>=security[i]){
                afterSum[i]= afterSum[i+1]+1;
            }
        }

        for(int i=0; i<n; i++){
            if(beforeSum[i]>=time && afterSum[i]>=time){
                res.add(i);
            }
        }
        return res;
    }

    
}