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
    static int idx;
    public static TreeNode helper(int[] arr,int start,int end){
        if(idx==arr.length || arr[idx]<start || arr[idx]>end){
            return null;
        }
        int val=arr[idx++];
        TreeNode root = new TreeNode(val);
        root.left=helper(arr,start,val);
        root.right=helper(arr,val,end);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        idx=0;
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}