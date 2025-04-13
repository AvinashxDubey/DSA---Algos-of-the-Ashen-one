class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m= nums2.length;
        int[] newNums = new int[m+n];
        int newLen = newNums.length;
        int index=0;
        for(int i=0; i<newNums.length; i++){
            if(i<n) newNums[i]=nums1[i];
            else newNums[i] = nums2[index++];
        }
        Arrays.sort(newNums);
        double median=0;
        if(newLen%2==0){
            median = (double)(newNums[newLen/2-1]+newNums[newLen/2])/2;
        }
        else{
            median = (double)newNums[newLen/2];
        }
        return median;
    }
}