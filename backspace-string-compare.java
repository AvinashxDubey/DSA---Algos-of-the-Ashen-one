class Solution {
    public boolean backspaceCompare(String s, String t) {
        int ptr1 = s.length()-1, ptr2= t.length()-1;

        while(ptr1>=0 || ptr2>=0) {
            int i = getNextChar(s, ptr1);
            int j = getNextChar(t, ptr2);

            // reached the end so both are equal as there has been no prob
            if(i<0 && j<0){
                return true;
            }

            // reached the end of one but not the other
            if(i<0 || j<0){
                return false;
            }

            // characters of both are not equal
            if(s.charAt(i)!=t.charAt(j)){
                return false;
            }

            ptr1 = i-1;
            ptr2 = j-1;
        }

        return true;
    }

    public int getNextChar(String s, int i){
        int backspace = 0;
        while(i>=0){
            if(s.charAt(i)=='#') backspace++;
            else if(backspace>0) backspace--;
            else break;
            i--;
        }
        return i;
    }
}