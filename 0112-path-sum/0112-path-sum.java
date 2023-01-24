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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(targetSum-root.val==0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean ans =false;
        if(root.left!=null){
            ans = ans || hasPathSum(root.left,targetSum-root.val);
        }
        if(root.right!=null){
            ans = ans || hasPathSum(root.right,targetSum-root.val);
        }
        return ans;
    }
}