class Solution {
    class Pair{
        int index;
        char b;

        public Pair(int index, char b){
            this.index = index;
            this.b = b;
        }
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> brackets = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!brackets.isEmpty() && ch==')' && brackets.peek().b=='(') brackets.pop();
            else if(!Character.isLetter(ch))brackets.push(new Pair(i, ch));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            boolean skip=false;
            for(Pair p : brackets){
                if(p.index==i){
                    skip=true;
                    break;
                }
            }
            if(!skip) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}