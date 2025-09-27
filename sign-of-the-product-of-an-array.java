class Solution {
    public int arraySign(int[] nums) {
        int signProd =1;
        for(int num : nums){
            int val =1;
            if(num==0){
                val=0;
            }
            else if(num<0){
                val=-1;
            }
            signProd*=val;
        }
        return signProd;
    }
}