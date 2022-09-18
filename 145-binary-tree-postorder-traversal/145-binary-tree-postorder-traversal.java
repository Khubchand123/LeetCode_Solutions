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
    public void postOrder(TreeNode ro){
        if(ro==null){
            return;
        }
        
        postOrder(ro.left);
        postOrder(ro.right);
        obj.add(ro.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return obj;
    }
}