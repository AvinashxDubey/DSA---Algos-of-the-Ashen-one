class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        final long MOD = 1000000007;
        int[] leftMax =  findLeftMax(nums);
        int[] rightMax = findRightMax(nums);
        int[] leftMin = findLeftMin(nums);
        int[] rightMin = findRightMin(nums);
        for(int i=0; i<nums.length; i++){
            ans += (long)nums[i]*leftMax[i]*rightMax[i];
            ans -= (long)nums[i]*leftMin[i]*rightMin[i];
        }
        return ans;
    }

    public int[] findLeftMin(int[] arr){
        int n = arr.length;
        int[] leftMin = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            leftMin[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        return leftMin;
    }

    public int[] findRightMin(int[] arr){
        int n = arr.length;
        int[] rightMin = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            rightMin[i] = st.isEmpty() ? n-i : st.peek()-i;
            st.push(i);
        }
        return rightMin;
    }

    public int[] findLeftMax(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }

            leftMax[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        return leftMax;
    }

    public int[] findRightMax(int[] arr){
        int n = arr.length;
        int[] rightMax = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            rightMax[i] = st.isEmpty() ? n-i : st.peek()-i;
            st.push(i);
        }
        return rightMax;
    }
}