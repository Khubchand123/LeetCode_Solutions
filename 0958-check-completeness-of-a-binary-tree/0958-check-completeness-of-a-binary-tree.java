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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean ans = false;
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode == null) {
                ans = true;
            } else {
                if(ans) {
                    return false;
                }
                queue.offer(currentNode.left);
                queue.offer(currentNode.right);
            }
            
        }
        return true;
    }
}