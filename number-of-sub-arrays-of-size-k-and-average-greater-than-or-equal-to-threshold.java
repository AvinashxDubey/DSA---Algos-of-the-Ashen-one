class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0, res=0;
        int left=0, right=0;
        for(right=0; right<k; right++){
            sum+=arr[right];
        }

        if((double)sum/k>=(double)threshold){
            res++;
        }

        
        while(right<arr.length){
            sum-=arr[left];
            sum+=arr[right];
            
            if((double)sum/k>=(double)threshold){
                res++;
            }
            
            left++;
            right++;
        }

        return res;
    }
}