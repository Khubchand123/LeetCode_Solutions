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
    void helper(TreeNode root,List<String> obj,String s){
        if(root.left==null && root.right==null){
            s+=root.val;
            obj.add(s);
            return;
        }
        if(root.left!=null){
            helper(root.left,obj,s+root.val+"->");
        }
        if(root.right!=null){
            helper(root.right,obj,s+root.val+"->");
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
}