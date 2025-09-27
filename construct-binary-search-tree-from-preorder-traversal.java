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
    /**
    in bst, left element < root and right element > root
    for recursion lets have a bound,
    if the element is less than the value of root link it to left of root
    otherwise its null
    similarly, if right is larger than the bound of root then link it to right
    */
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstPreHelper(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode bstPreHelper(int[] preorder, int bound){
        if(index>=preorder.length || preorder[index]>bound) return null;
        TreeNode node = new TreeNode(preorder[index++]);
        node.left = bstPreHelper(preorder, node.val);
        node.right = bstPreHelper(preorder, bound);
        return node;
    }
}