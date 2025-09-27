class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}