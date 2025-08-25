class Solution {
    /**
        this can be solved using line sweep algorithm
        we'll maintain an active record of no of passangers,
        adding and removing em acc to fromi and starti
        while looping if it exceeds the capacity at any location we'll return false
        otheriwise return true
     */
    public boolean carPooling(int[][] trips, int capacity) {
        int[] ppl = new int[1001];
        for(int[] trip : trips){
            ppl[trip[1]]+=trip[0];
            ppl[trip[2]]-=trip[0];
        }

        int currCapacity = 0;
        for(int i=0; i<1001; i++){
            currCapacity+=ppl[i];
            if(currCapacity>capacity){
                return false;
            }
        }

        return true;
    }
}