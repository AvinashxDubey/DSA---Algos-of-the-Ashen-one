class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if(i+k<s.length()){
                res.add(s.substring(i, i+k));
                i+=k;
            }
            else{
                StringBuilder sb = new StringBuilder(s.substring(i, s.length()));
                while(sb.length()<k){
                    sb.append(fill);
                }
                res.add(sb.toString());
                i+=k;
            }
        }
        String[] ans = new String[res.size()];
        for(int j=0; j<res.size(); j++){
            ans[j]=res.get(j);
        }
        return ans;
    }
}