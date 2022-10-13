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
    public void inOrder(TreeNode root,List<Integer> obj){
        if(root==null){
            return;
        }
        inOrder(root.left,obj);
        obj.add(root.val);
        inOrder(root.right,obj);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> obj = new ArrayList<>();
        inOrder(root,obj);
        return obj;
    }
}