class Solution {
    public int majorityElement(int[] nums) {
        // one approach could be using hashmap
        // other could be sorting and returning the first element occuring more than n/2 times
        // MOORE'S VOTING ALGORITHM (optimal)
        // 1) use a count var, if count=0, update ans=nums[i]
        // 2) if ans == nums[i], vote up i.e. count++
        // 3) if ans != nums[i], vote down i.e. count--
        // whichever ans stays with +ve count is the majority element
        // this works cz the ques suggests than freq(ans)>n/2
        int count=0, ans = 0, n = nums.length;
        for(int i=0; i<n; i++){
            if(count==0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                count++;
            }
            else if(ans!=nums[i]){
                count--;                
            }
            
        }
        return ans;
    }
}