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
    TreeNode helper(int[] nums,int left,int mid,int right){
        if(left>right){
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        int maxl=-1;
        int idxl=-1;
        for(int i=left;i<mid;i++){
            if(nums[i]>maxl){
                maxl=nums[i];
                idxl=i;
            }
        }
        root.left=helper(nums,left,idxl,mid-1);
        int maxr=-1;
        int idxr=-1;
        for(int i=mid+1;i<=right;i++){
            if(nums[i]>maxr){
                maxr=nums[i];
                idxr=i;
            }
        }
        root.right = helper(nums,mid+1,idxr,right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int max=-1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        return helper(nums,0,idx,nums.length-1);
    }
}