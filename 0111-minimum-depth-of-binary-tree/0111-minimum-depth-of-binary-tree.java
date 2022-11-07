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
    int ans=Integer.MAX_VALUE;
    void helper(TreeNode root,int path){
        if(root==null){
            return;
        }
        path+=1;
        if(root.left==null && root.right==null){
            ans=Math.min(ans,path);
            return;
        }
        if(root.left!=null){
            helper(root.left,path);
        }
        if(root.right!=null){
            helper(root.right,path);
        }
        path-=1;
    }
    public int minDepth(TreeNode root) {
        helper(root,0);
        return ans!=Integer.MAX_VALUE?ans:0;
    }
}