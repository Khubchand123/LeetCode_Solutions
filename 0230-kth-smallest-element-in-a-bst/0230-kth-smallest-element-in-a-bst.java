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
    int ans;
    int step;
    void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        step--;
        if(step==0){
            ans=root.val;
            return;
        }
        helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        step=k;
        helper(root);
        return ans;
    }
}