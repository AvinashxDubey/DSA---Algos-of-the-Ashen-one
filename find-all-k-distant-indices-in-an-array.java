class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i=0, j=nums.length-1;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(i=0; i<nums.length; i++){
            if(nums[i]==key){
                countOccurences(nums, i, k, set);
            }
        }
        res.addAll(set);
        Collections.sort(res);
        return res;
    }

    private void countOccurences(int[] nums, int i, int k, Set<Integer> set){
        int left = i-k, right=i+k;
        while(left<=right){
            if(left>=0 && left<nums.length){
                if(!set.contains(left)){
                    set.add(left);
                }
            }
            left++;
        }
    }
}