class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesisHelper(0, 0, n, res, new StringBuilder());
        return res;
    }

    public void generateParenthesisHelper(int opened, int closed, int n, List<String> res, StringBuilder sb){
        if(opened==n && closed==n){
            res.add(new String(sb));
            return;
        }

        if(opened<n){
            sb.append('(');
            generateParenthesisHelper(opened+1, closed, n, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(closed<opened){
            sb.append(')');
            generateParenthesisHelper(opened, closed+1, n, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}