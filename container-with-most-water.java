class Solution {
    /**
        we use two pointer approach
        valid height of water container would be h= min(leftH, rightH);
        we calc area = (r-l) * h
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length-1;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            maxArea = Math.max(maxArea, h*w);
            if(height[l]<height[r]){
                l++;
            }
            else if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        return maxArea;
    }
}