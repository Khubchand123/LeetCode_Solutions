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
            // 1.recursive method
    // public void inOrder(TreeNode root,List<Integer> obj){
    //     if(root==null){
    //         return;
    //     }
    //     inOrder(root.left,obj);
    //     obj.add(root.val);
    //     inOrder(root.right,obj);
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> obj = new ArrayList<>();
                // 1. recursive method
        // inOrder(root,obj);
        // return obj;
        
        
                // 2 Iterative Method
        if(root==null){
            return obj;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                obj.add(temp.val);
                temp=temp.right;
            }
        }
        return obj;
    }
}