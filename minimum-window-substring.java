class Solution {
    public String minWindow(String s, String t) {
        /**
            use two hashmaps for s & t and use sliding window
            to find smallest valid window, shrink the left to get minLeft and minStart
         */
        int[] freq = new int[128];
        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int l=0;
        int minLeft = -1, minLen=Integer.MAX_VALUE;
        int count =0;
        for(int r=0; r<s.length(); r++){
            if(freq[s.charAt(r)]>0){
                count++;
            }
            freq[s.charAt(r)]--;

            while(count==t.length()){
                if(r-l+1<minLen){
                    minLeft = l;
                    minLen = r-l+1;
                }
                
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0) count--;
                l++;
            }
        }
        return minLeft==-1 ? "" : s.substring(minLeft, minLeft+minLen);
    }
}