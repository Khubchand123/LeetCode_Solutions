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
            // Approach1 n^2 solution
    // public static int height(TreeNode root){
    //     if(root==null){
    //         return -1;
    //     }
    //     return Math.max(height(root.left),height(root.right))+1;
    // }
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null){
    //         return 0;
    //     }
    //     int ld = diameterOfBinaryTree(root.left);
    //     int rd = diameterOfBinaryTree(root.right);
    //     int sd = height(root.left)+height(root.right)+2;
    //     return Math.max(ld,Math.max(rd,sd));
    // }
    
    
                // Approach2 n solution
    class Diapair{
        int h = -1;
        int d = 0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
    public Diapair diameter(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair ldp = diameter(root.left);
        Diapair rdp = diameter(root.right);
        Diapair sdp = new Diapair();
        int sd = ldp.h+rdp.h+2;
        sdp.d = Math.max(ldp.d,Math.max(rdp.d,sd));
        sdp.h = Math.max(ldp.h,rdp.h)+1;
        return sdp;
    }
}