class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        /**
        elements are processed from the end
        thus overwriting either unprocessed or empty elements
        we iterate using the second array to ensure we correctly process all the elements
        in the second array
        */
        while(j>=0){
            // checking i>=0 to avoid using invalid index in nums1
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
    }
}