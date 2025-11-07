class Solution {
    public boolean judgeCircle(String moves) {
        int vCount = 0;
        int hCount = 0;

        for(char ch : moves.toCharArray()){
            if(ch=='U') vCount++;
            else if(ch=='D') vCount--;
            else if(ch=='R') hCount++;
            else hCount--;
        }

        return vCount==0 && hCount==0;
    }
}