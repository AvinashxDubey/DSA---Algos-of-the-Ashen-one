class Solution {
    public int hIndex(int[] citations) {
        int low = 0, up=citations.length;
        int maxH = 0;
        while(low<=up){
            int mid = low + (up-low)/2;
            if(isValid(citations, mid)){
                maxH = mid;
                low = mid+1;
            }
            else{
                up = mid-1;
            }
        }
        return maxH;
    }

    private boolean isValid(int[] citations, int h){
        int count = 0;
        for(int num : citations){
            if(num>=h) count++;
            if(count>=h) return true;
        }
        return false;
    }
}