class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        min+=k;
        max-=k;

        if(min>=max) return 0;
        return max-min;
    }
}