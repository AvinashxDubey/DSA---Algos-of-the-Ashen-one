class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low; i<=high; i++){
            if(i>9){
                int n = 0, temp=i;
                while(temp!=0){
                    temp/=10;
                    n++;
                }
                if((n&1)==0 && leftN(i, n)==rightN(i, n)){
                    count++;
                }
            }
        }
        return count;
    }

    private int leftN(int num, int n){
        int ldSum=0;
        int[] digits = new int[n];
        for(int i=n-1; i>=0; i--){
            digits[i]=num%10;
            num/=10;
        }

        for(int i=0; i<n/2; i++){
            ldSum+=digits[i];
        }
        return ldSum;
    }

    private int rightN(int num, int n){
        int rdSum=0;
        for(int i=0; i<n/2; i++){
            rdSum+=num%10;
            num/=10;
        }
        return rdSum;
    }
}