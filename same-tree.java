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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        Stack<TreeNode[]> st = new Stack<>();
        st.push(new TreeNode[] {p, q});
        while(!st.isEmpty()){
            TreeNode[] nodes = st.pop();
            TreeNode first = nodes[0];
            TreeNode second = nodes[1];
            if(first.val!=second.val) return false;
            if(first.left!=null || second.left!=null){
                if(first.left==null || second.left==null) return false;
                st.push(new TreeNode[] {first.left, second.left});
            } 
            
            if(first.right!=null || second.right!=null){
                if(first.right==null || second.right==null) return false;
                st.push(new TreeNode[] {first.right, second.right});
            } 
        }
        return true;
    }

    
}