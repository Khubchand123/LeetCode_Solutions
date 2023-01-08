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
    // List<Integer> obj
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> obj = new ArrayList<>();
        if(root==null){
            return obj;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                obj.add(temp.val);
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                temp=temp.right;
            }
        }
        return obj;
        // obj.add(root.val);
        // preorderTraversal(root.left);
        // preorderTraversal(root.right);
        // return obj;
    }
}