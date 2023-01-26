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
    boolean ans;
    void traversal(TreeNode root,Set<Integer> set,int k){
        if(root==null){
            return;
        }
        if(set.contains(k-root.val)){
            ans=true;
            return;
        }
        else{
            set.add(root.val);
        }
        traversal(root.left,set,k);
        traversal(root.right,set,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        ans=false;
        traversal(root,set,k);
        return ans;
    }
}