class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n=nums.length;
        int MOD = (int)(1e9 + 7);  
        //stores positions after operations
        long[] positions = new long[n];
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='R'){
                positions[i]=nums[i]+(long)d;
            }
            else{
                positions[i]=nums[i]-(long)d;
            }
        }
        Arrays.sort(positions);
        long preSum=0;
        long res=0;

        for(int i=0; i<n; i++){
            res = (res+i*(long)positions[i]-preSum)%MOD;
            
            preSum+=positions[i];
        }
        return (int)res;
    }
}