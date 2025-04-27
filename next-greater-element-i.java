class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m=nums2.length;
        int[] nge2  = new int[m];
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=m-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge2[i]=-1;
            }
            else{
                nge2[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        
        for(int i=0; i<m; i++){
            map.put(nums2[i], nge2[i]);
        }

        for(int i=0; i<n; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
    
}