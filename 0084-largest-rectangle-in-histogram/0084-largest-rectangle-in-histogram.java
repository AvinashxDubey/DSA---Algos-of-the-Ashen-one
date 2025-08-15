class Solution {
    /**
        we need to find the nextSmallerEle(NSE) and prevSmallerEle(PSE)
        which are actually indices
        we then do NSE-PSE-1, to include elements larger than current ele in width using NSE and PSE
        and not the NSE and PSE elements
        lets say for: [2,1,5,6,2,3]
                       0 1 2 3 4 5
        At idx=3, NSE[3] = 4, PSE[3] = 2, THEN h=6, w=4-2-1=1, area=6*1=6
        At idx=2, NSE[2] = 4, PSE[2] = 1, THEN h=5, w=4-1-1=2, area=5*2=10
     */
    public int largestRectangleArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int[] NSE = findNextSmallerElements(heights);
        int[] PSE = findPrevSmallerElements(heights);
        
        for(int i=0; i<heights.length; i++){
            int h = heights[i];
            int w = NSE[i] - PSE[i] - 1;
            maxArea = Math.max(maxArea, h*w);
        }
        return maxArea;
    }

    public int[] findNextSmallerElements(int[] heights){
        int[] NSE = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }

            NSE[i] = st.isEmpty() ? heights.length : st.peek();
            st.push(i);
        }
        return NSE;
    }

    public int[] findPrevSmallerElements(int[] heights){
        int[] PSE = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }

            PSE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return PSE;
    }
}