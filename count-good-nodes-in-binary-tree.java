/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        int max = 0;
        int count = 0;
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> maxTrack = new Stack<>();
        st.push(root);
        maxTrack.push(root.val);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            int nodeMax = maxTrack.pop();
            if(node==null){
                maxTrack.pop();
                continue;
            }
            
            if(node.val>=nodeMax){
                count++;
            }
            
            int newNodeMax = Math.max(nodeMax, node.val);
            if(node.right!=null){
                st.push(node.right);
                maxTrack.push(newNodeMax);
            }
            if(node.left!=null){
                st.push(node.left);
                maxTrack.push(newNodeMax);
            }

        }
        return count;
    }
}