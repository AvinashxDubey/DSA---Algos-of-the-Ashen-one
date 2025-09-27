class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int maxH = 0;
        int n = citations.length;
        int left = 0, right=citations.length;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(validHIndex(citations, mid)){
                maxH = Math.max(maxH, mid);
                left = mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return maxH;
    }

    private static boolean validHIndex(int[] citations, int h){
        int count =0;
        for(int i=0; i<citations.length; i++){
            if(citations[i]>=h){
                count++;
            }
            if(count>=h) return true;
        }

        return false;
    } 
    
}