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
    int totalSum=0;
    void helper(TreeNode root,String sum){
        sum+=root.val;
        if(root.left==null && root.right==null){
            totalSum+=Integer.parseInt(sum);
            return;
        }
        if(root.left!=null){
            helper(root.left,sum);
        }
        if(root.right!=null){
            helper(root.right,sum);
        }
        sum=sum.substring(0,sum.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return totalSum;
    }
}