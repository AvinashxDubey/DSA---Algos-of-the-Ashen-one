class Solution {
    public int maximumCount(int[] nums) {
        int posLb=-1, negUb=-1, zCount=0, n=nums.length;
        int start =0, end=n-1;
        //finding negative ub
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<0){
               start = mid+1; 
                negUb = mid;
            }
            else{
                end = mid-1;
            }
        }
        //finding postive lb
        start=0;
        end=n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>0){
                end = mid-1;
                posLb = mid;
            }
            else{
                start = mid+1;   
            }
        }
        int posCount = (posLb!=-1) ? n-posLb : 0;
        int negCount = negUb+1;
        return Math.max(posCount, negCount);
    }
}