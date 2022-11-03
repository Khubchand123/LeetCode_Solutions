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
    TreeNode helper(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode obj = new TreeNode(root.val);
        obj.left=helper(root.right);
        obj.right=helper(root.left);
        return obj;
    }
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
}