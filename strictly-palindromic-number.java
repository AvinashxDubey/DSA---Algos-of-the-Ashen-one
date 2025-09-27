class Solution {
    public boolean isStrictlyPalindromic(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i=2; i<=n-2; i++){
            int temp = n;
            while(temp>0){
            sb.append(temp%i);
            temp/=i;
            }
            System.out.println(sb);
            int l=0, r=sb.length()-1;
            while(l<=r){
                if(sb.charAt(l++)!=sb.charAt(r--)){
                    return false;
                }
            }
            sb.setLength(0);
        }
        return true;
    }
}