class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int m = bank.length;
        int n = bank[0].length();
        int[] dp = new int[m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(bank[i].charAt(j)=='1'){
                    dp[i]++;
                }
            }
        }
        
        int prev = 0;
        for(int count : dp){
            if(count!=0){
                res += prev * count;
                prev= count;
            }
        }
        
        return res;
    }
}