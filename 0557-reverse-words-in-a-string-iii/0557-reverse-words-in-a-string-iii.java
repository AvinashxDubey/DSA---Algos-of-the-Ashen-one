class Solution {
    public String reverseWords(String s) {
        int l = 0;
        char[] charArr = s.toCharArray();

        for(int r=0; r<=charArr.length; r++){
            if(r==charArr.length || charArr[r]==' '){
                reverse(charArr, l, r-1);
                l = r+1;
            }
        }
        return new String(charArr);
    }

    public void reverse(char[] charArr, int i, int j){
        while(i<j){
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }
    }
}