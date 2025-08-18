class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length <= 0)
            return res;
        int[] temp = new int[2];
        temp[0] = nums[0];
        temp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                temp[1] = nums[i];
            } else {
                if (temp[0] == temp[1]) {
                    res.add(String.valueOf(temp[0]));
                } else {
                    res.add(String.valueOf(temp[0]) + "->" + String.valueOf(temp[1]));
                }
                temp[0] = nums[i];
                temp[1] = nums[i];
            }
        }

        if (temp[0] == temp[1]) {
            res.add(String.valueOf(temp[0]));
        } else {
            res.add(String.valueOf(temp[0]) + "->" + String.valueOf(temp[1]));
        }
        return res;
    }
}