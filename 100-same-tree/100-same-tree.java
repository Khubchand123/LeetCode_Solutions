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
    int m=0;
    void traverse(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return;
        }
        else if((p==null && q!=null) || (p!=null && q==null)){
            m=1;
            return;
        }
        if(p.val!=q.val){
            m=1;
        }
        traverse(p.left,q.left);
        traverse(p.right,q.right);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p,q);
        if(m==1){
            return false;
        }
        else{
            return true;
        }
    }
}