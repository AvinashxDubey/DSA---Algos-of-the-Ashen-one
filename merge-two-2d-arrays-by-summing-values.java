class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> mergeMap = new TreeMap<>();
        for(int[] num1 : nums1){
            mergeMap.put(num1[0], num1[1]);
        }

        for(int[] num2 : nums2){
            mergeMap.put(num2[0], mergeMap.getOrDefault(num2[0], 0)+num2[1]);
        }

        int[][] res = new int[mergeMap.size()][2];
        int index =0;
        for(Map.Entry<Integer, Integer> e : mergeMap.entrySet()){
            res[index][0]=e.getKey();
            res[index][1]=e.getValue();
            index++;
        }

        return res;
    }
}