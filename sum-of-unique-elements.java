class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(val==1){
                sum+=key;
            }
        }
        return sum;
    }
}