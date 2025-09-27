class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot) small.add(nums[i]);
            else if(nums[i]==pivot) equal.add(nums[i]);
            else large.add(nums[i]);
        }

        int index=0;
        for(int i=0; i<small.size(); i++){
            nums[index++]=small.get(i);
        }

        for(int i=0; i<equal.size(); i++){
            nums[index++]=equal.get(i);
        }

        for(int i=0; i<large.size(); i++){
            nums[index++]=large.get(i);
        }

        return nums;
    }
}