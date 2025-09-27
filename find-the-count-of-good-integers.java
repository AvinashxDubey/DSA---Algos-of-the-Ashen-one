class Solution {
    public long countGoodIntegers(int n, int k) {
        Set<String> set = new HashSet<>();
        int d=(n+1)/2;
        int low=(int)Math.pow(10, d-1);
        int high = (int)Math.pow(10, d)-1;
        for(int i=low; i<=high; i++){
            String leftHalf = String.valueOf(i);
            StringBuilder full = new StringBuilder(leftHalf);
            if(n%2==0){
                StringBuilder rightHalf = new StringBuilder(leftHalf);
                rightHalf.reverse();
                full.append(rightHalf);
            }
            else{
                StringBuilder rightHalf = new StringBuilder(leftHalf.substring(0, leftHalf.length()-1));
                rightHalf.reverse();
                full.append(rightHalf);
            }

            long num = Long.valueOf(full.toString());
            if(num%k!=0) continue;
            char[] fullArr = full.toString().toCharArray();
            Arrays.sort(fullArr);
            String finalFull= String.valueOf(fullArr);
            set.add(finalFull);
        }


        //for unit digits
        long[] fact = new long[11];
        fact[0]=1;
        for(int i=1; i<11; i++){
            fact[i]=fact[i-1]*i;
        }

        long res=0;
        for(String s : set){
            int len=s.length();
           int[] count = new int[11];
            for(char ch : s.toCharArray()){
                count[ch-'0']++;
            }

            int nonZeroDigits = len - count[0];

            long perm = nonZeroDigits * fact[len-1];
            for(int i=0; i<10; i++){
                perm/=fact[count[i]];
            }
            res+=perm;
        }
        return res;
    }
}