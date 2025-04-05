class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int num : nums){
            ls.add(num);
        }
        int count=0;
        while(!isNonDecreasing(ls)){
            int minSum=Integer.MAX_VALUE;
            int index=-1;

            for(int i=0; i<ls.size()-1; i++){
                int sum = ls.get(i)+ls.get(i+1);
                if(sum<minSum){
                    minSum=sum;
                    index=i;
                }
            }
            int pairSum = minSum;
            ls.set(index, pairSum);
            ls.remove(index+1);
            count++;
        }
        
        return count;
    }

    private boolean isNonDecreasing(List<Integer> ls){
        for(int i=0; i<ls.size()-1; i++){
            if(ls.get(i)>ls.get(i+1)) return false;
        }
        return true;
    }
}