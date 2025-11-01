class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        validStringsGen(0, n, res, new StringBuilder(), false);
        return res;
    }

    public void validStringsGen(int i, int n, List<String> res, StringBuilder sb, Boolean isPrevZero){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }

        sb.append(1);
        validStringsGen(i+1, n, res, sb, false);
        sb.deleteCharAt(sb.length()-1);

        if(!isPrevZero){
            sb.append(0);
            validStringsGen(i+1, n, res, sb, true);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}