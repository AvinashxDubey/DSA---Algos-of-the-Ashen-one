class Solution {
    public int longestPalindrome(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int m = s.length(), n=t.length();
        int maxLen=1;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                String prefix = s.substring(i, j + 1);
                if (isPalindrome(prefix)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = k; l < n; l++) {
                String suffix = t.substring(k, l + 1);
                if (isPalindrome(suffix)) {
                    maxLen = Math.max(maxLen, l - k + 1);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=i; j<m; j++){
                String prefix = s.substring(i, j+1);
                for(int k = 0; k<n; k++){
                    for(int l=k; l<n; l++){
                        String suffix = t.substring(k, l+1);
                        sb.setLength(0);
                        sb.append(prefix).append(suffix);
                        if(isPalindrome(sb.toString())){
                            maxLen = Math.max(maxLen, sb.length());
                        }
                    }
                }
            }
        }
        return maxLen;
    }

    private boolean isPalindrome(String str){
        int l = 0, r=str.length()-1;
        while(l<=r){
            if(str.charAt(l++)!=str.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}