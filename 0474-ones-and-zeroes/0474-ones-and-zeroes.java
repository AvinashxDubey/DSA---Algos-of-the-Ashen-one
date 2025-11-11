class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[] zeroes = new int[len];
        int[] ones  = new int[len];

        for(int i = 0; i<len; i++){
            for(char ch : strs[i].toCharArray()){
                if(ch=='0') zeroes[i]++;
                else ones[i]++;
            }
        }

        Integer[][][] memo = new Integer[len+1][m+1][n+1];
        return dfs(0, m, n, zeroes, ones, memo);
    }

    public int dfs(int idx, int m, int n, int[] zeroes, int[] ones, Integer[][][] memo){
        if(idx==zeroes.length) return 0;
        if(memo[idx][m][n]!=null) return memo[idx][m][n];

        // skip this string
        int skip = dfs(idx+1, m, n, zeroes, ones, memo);

        // take this str
        int take = 0;
        if(m>=zeroes[idx] && n>=ones[idx]){
            take = 1 + dfs(idx+1, m-zeroes[idx], n-ones[idx], zeroes, ones, memo);
        }

        memo[idx][m][n] = Math.max(skip, take);
        return memo[idx][m][n];
    }
}