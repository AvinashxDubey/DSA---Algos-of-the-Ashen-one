class Solution {
    public int largestInteger(int[] nums, int k) {
       HashMap<Integer, Integer> windowMap = new HashMap<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int n=nums.length;
        
        for(int i=0; i<k; i++){
            windowMap.put(nums[i], windowMap.getOrDefault(nums[i], 0)+1);
        }


        for(int i=0; i<=n-k; i++){

            for(Map.Entry<Integer, Integer> entry : windowMap.entrySet()){
                int num = entry.getKey();
                   countMap.put(num, countMap.getOrDefault(num, 0)+1);
            }
            if(i+k<n){
                int remove = nums[i];
                int add = nums[i+k];

                windowMap.put(remove, windowMap.getOrDefault(remove, 0)-1);
                if(windowMap.get(remove)==0){
                    windowMap.remove(remove);
                }

                windowMap.put(add, windowMap.getOrDefault(add, 0)+1);
            }

            
        }


        int largestMissing=-1;

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue()==1){
                largestMissing = Math.max(largestMissing, entry.getKey());
            }
        }        
        return largestMissing;
    }
}