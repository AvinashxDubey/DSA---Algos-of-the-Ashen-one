class Solution {
    public int maxFrequencyElements(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        int totalMaxFreq = 0;
        int maxFreq = 0;
        for(int num: nums){
            int freq = hash.getOrDefault(num, 0) + 1;
            hash.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        for(int freq:hash.values()){
            if(freq==maxFreq){
                totalMaxFreq += freq;
            }
        }

        return totalMaxFreq;
    }
}