class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // using Boyer-Moore Majority Voting algorithm
        // if we divide an array into three parts
        // than no of elements with freq>3 can only possibly at most 2
        // 1) if count=0 and num[i]!=othercandiate, oneCandidate=nums[i]
        // 2) if nums[i]==candidate, count++, else count--
        List<Integer> res = new ArrayList<>();
        int count1=0, count2=0, candidate1=0, candidate2=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(count1==0 && nums[i]!=candidate2){
                candidate1=nums[i];
            }
            else if(count2==0 && nums[i]!=candidate1){
                candidate2=nums[i];
            }

            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        //checking if the freq(candidate)>3
        count1=0;
        count2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
        }
        if(count1>n/3){
            res.add(candidate1);
        }
        if(count2>n/3){
            res.add(candidate2);
        }
        return res;
    }
}