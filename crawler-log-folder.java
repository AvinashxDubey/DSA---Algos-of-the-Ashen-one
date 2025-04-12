class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        st.push("/");
        for(String cmd : logs){
            if(cmd.equals("../")){
                if(st.size()>1){
                    st.pop();
                }
            }
            else if(cmd.equals("./")){
                continue;
            }
            else{
                st.push(cmd);
            }
        }
        return st.size()-1;
    }
}