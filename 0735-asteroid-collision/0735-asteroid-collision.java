class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int ast : asteroids){
            boolean destroyCurr = false;

            while(!st.isEmpty() && st.peek()>0 && ast<0){
                int leftAst = st.peek();
                int rightAst = Math.abs(ast);
                if(leftAst==rightAst){
                    st.pop();
                    destroyCurr=true;
                    break;
                }
                else if(leftAst>rightAst){
                    destroyCurr = true;
                    break;
                }
                else{
                    st.pop();
                }
            }
            
            if(!destroyCurr){
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}