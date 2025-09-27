import java.util.regex.Pattern;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] strs = Pattern.compile("/+").split(path, 0);
        for(String str : strs){
            if(str.isEmpty() || str.equals(".")){
                continue;
            }
            else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String dir : st){
            sb.append('/').append(dir);
        }
        return sb.length()>0 ? sb.toString() : "/";
    }
}