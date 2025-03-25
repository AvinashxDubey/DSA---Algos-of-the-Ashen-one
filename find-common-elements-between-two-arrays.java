class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        int[] numMap1 = new int[101];
        int[] numMap2 = new int[101];
        for(int num : nums1){
            numMap1[num]++;
        }

        for(int num : nums2){
            numMap2[num]++;
        }

        for(int i=1; i<101; i++){
            if(numMap1[i]>0 && numMap2[i]>0){
                res[0]+=numMap1[i];
            }
            if(numMap1[i]>0 && numMap2[i]>0){
                res[1]+=numMap2[i];
            }
        }
        return res;
    }
}