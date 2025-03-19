class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String str : tokens){
            if(str.matches("-?\\d+")){
                st.push(Integer.valueOf(str));
            }
            else{
                int second= st.pop();
                int first = st.pop();
                int val = calc(first, second, str.charAt(0));
                st.push(val);
            }
        }
        return st.pop();
    }
    
    private int calc(int a, int b, char op){
        int ans=0;
        switch(op){
            case '+':
                ans = a+b;
                break;
            case '-':
                ans = a-b;
                break;
            case '*':
                ans = a*b;
                break;
            case '/':
                ans = a/b;
                break;
        }
        return ans;  
    }
}