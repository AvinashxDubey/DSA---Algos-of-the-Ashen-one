class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int[] nums = new int[str.length()];
        for(int i=0; i<nums.length; i++){
            nums[i] = str.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length; i++){
            if(nums[i]==6){
                nums[i]= 9;
                break;
            }
        }

        int res = 0;
        for(int i=0; i<nums.length; i++){
            res = res*10 + nums[i];
        }

        return res;
    }
}