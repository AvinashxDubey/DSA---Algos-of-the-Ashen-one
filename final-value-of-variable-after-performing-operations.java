class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String op : operations){
            if(op.charAt(0)=='-' || op.charAt(op.length()-1)=='-'){
                ans--;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}