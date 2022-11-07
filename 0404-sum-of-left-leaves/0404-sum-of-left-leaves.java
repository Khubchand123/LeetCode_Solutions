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
    int ans=0;
    void helper(TreeNode root,int flag){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && flag==1){
            ans+=root.val;
            return;
        }
        if(root.left!=null){
            helper(root.left,1);
        }
        if(root.right!=null){
            helper(root.right,0);
        }
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,0);
        return ans;
    }
}