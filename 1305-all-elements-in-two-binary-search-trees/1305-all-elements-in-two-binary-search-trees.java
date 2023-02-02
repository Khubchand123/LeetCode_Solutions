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
    void helper(List<Integer> ans,TreeNode root){
        if(root==null){
            return;
        }
        helper(ans,root.left);
        ans.add(root.val);
        helper(ans,root.right);
        
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        helper(ans1,root1);
        helper(ans2,root2);
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<ans1.size() || j<ans2.size()){
            if(i==ans1.size()){
                ans.add(ans2.get(j++));
            }
            else if(j==ans2.size()){
                ans.add(ans1.get(i++));
            }
            else{
                if(ans1.get(i)<ans2.get(j)){
                    ans.add(ans1.get(i++));
                }
                else{
                    ans.add(ans2.get(j++));
                }
            }
        }
        return ans;
    }
}