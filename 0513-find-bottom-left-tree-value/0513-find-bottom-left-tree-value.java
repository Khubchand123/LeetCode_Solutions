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
    int height=0;
    void helper(TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(height<depth){
            ans = root.val;
            height=depth;
        }
        helper(root.left,depth+1);
        helper(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        helper(root,1);
        return ans;
    }
}