class Solution {
    public int sumSubarrayMins(int[] arr) {
        final long MOD = 1000000007;
        int n = arr.length;
        int[] leftSpan = findLeftSpan(arr);
        int[] rightSpan = findRightSpan(arr);
        
        long ans = 0;
        for(int i=0; i<n; i++){
            ans = (ans + (long)arr[i] * leftSpan[i] * rightSpan[i])%MOD;
        }

        return (int)ans;
    }

    public int[] findLeftSpan(int[] arr){
        int n = arr.length;
        int[] leftSpan = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            leftSpan[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        return leftSpan;
    }

    public int[] findRightSpan(int[] arr){
        int n = arr.length;
        int[] rightSpan = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            rightSpan[i] = st.isEmpty() ? n-i : st.peek()-i;
            st.push(i);
        }
        return rightSpan;
    }
}