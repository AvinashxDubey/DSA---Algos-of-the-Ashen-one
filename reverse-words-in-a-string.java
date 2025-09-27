class Solution {
    /**
        1)create a stack(st) and stringbuilder(sb) if theres a space add the sb to st
        and set sb.length to 0, else add it to sb
        2)if theres no space at the end add the sb to st then set sb.length to 0
        3)pop all the element of stack and append em into sb
     */
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                if(!str.isEmpty()){
                    st.push(str.toString());
                    str.setLength(0);
                }
            }
            else{
                str.append(s.charAt(i));
            }
        }
        //adding the last word when there are no trailing spaces
        if(!str.isEmpty()){
            st.push(str.toString());
            str.setLength(0);
        }
        
        while(st.size()>1){
            str.append(st.pop() + " ");
            
        }
        str.append(st.pop());
        return str.toString();
    }
}