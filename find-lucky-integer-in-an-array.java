class Solution {
    public int findLucky(int[] arr) {
        int[] numMap = new int[501];
        int maxLucky = -1;
        for(int num : arr){
            numMap[num]++;
        }

        for(int i=1; i<501; i++){
            if(numMap[i]==i) maxLucky=i;
        }
        return maxLucky;
    }
}