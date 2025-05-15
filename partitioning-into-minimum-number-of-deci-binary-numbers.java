class Solution {
    public int minPartitions(String n) {
        int maxDigit = Integer.MIN_VALUE;
        for(char ch : n.toCharArray()){
            int digit = ch-'0';
            maxDigit = Math.max(maxDigit, digit);
        }
        return maxDigit;
    }
}