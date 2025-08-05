class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced =0;
        for(int i=0; i<fruits.length; i++){
            boolean isPlaced = false;
            for(int j=0; j<baskets.length; j++){
                if(baskets[j]!=0 && baskets[j]>=fruits[i]){
                    isPlaced = true;
                    baskets[j]=0;
                    break;
                }
            }
            if(!isPlaced) unplaced++;
        }
        return unplaced;
    }
}