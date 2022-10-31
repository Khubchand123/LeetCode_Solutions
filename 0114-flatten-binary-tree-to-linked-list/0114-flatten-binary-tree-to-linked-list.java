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
           // 1. using O(n) Space
    // void preOrder(List<Integer> obj,TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     obj.add(root.val);
    //     preOrder(obj,root.left);
    //     preOrder(obj,root.right);
    // }
    // public void flatten(TreeNode root) {
    //     if(root==null){
    //         return;
    //     }
    //     List<Integer> obj = new ArrayList<>();
    //     preOrder(obj,root);
    //     root.left=null;
    //     root.right=null;
    //     TreeNode temp=root;
    //     for(int i=1;i<obj.size();i++){
    //         temp.right=new TreeNode(obj.get(i));
    //         temp=temp.right;
    //     }
    // }
    
    
            // without using extra space
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right=prev;
        prev=root;
        
    }
}