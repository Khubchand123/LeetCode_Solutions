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
    

    public static void helper(TreeNode root,List<List<Integer>> ans,List<Integer> obj,int targetSum){
        if(root==null){
            return;
        }
        if(targetSum-root.val==0 && root.left==null && root.right==null){
            obj.add(root.val);
            ans.add(new ArrayList<>(obj));
            obj.remove(obj.size()-1);
            return;
        }

        obj.add(root.val);
        helper(root.left,ans,obj,targetSum-root.val);
        helper(root.right,ans,obj,targetSum-root.val);
        obj.remove(obj.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(root,ans,obj,targetSum);
        return ans;
    }
}