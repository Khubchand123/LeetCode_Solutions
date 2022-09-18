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
    List<Integer> obj=new ArrayList<>();
    public void preOrder(TreeNode ro){
        if(ro==null){
            return;
        }
        obj.add(ro.val);
        preOrder(ro.left);
        preOrder(ro.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return obj;
    }
}