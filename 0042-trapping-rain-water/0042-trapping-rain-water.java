class Solution {
    public int trap(int[] height) {
        int leftMax=height[0], rightMax=height[height.length-1];
        int left=1, right = height.length-2;
        int water = 0;
        while(left<=right){
            if(leftMax<=rightMax){
                leftMax = Math.max(leftMax, height[left]);
                water+=leftMax-height[left];
                left++;
            }
            else{
                rightMax = Math.max(rightMax, height[right]);
                water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }
}