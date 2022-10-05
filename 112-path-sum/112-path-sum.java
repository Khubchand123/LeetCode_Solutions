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
    public static boolean pathSum(TreeNode root,int sum,int targetsum){
        if(root==null){
            return false;
        }
        if(sum==targetsum && (root.left==null && root.right==null)){
            return true;
        }
        boolean res=false;
        if(root.left!=null){
            res=pathSum(root.left,sum+root.left.val,targetsum);
        }
        if(root.right!=null){
            res = res||pathSum(root.right,sum+root.right.val,targetsum);    
        }
       
        return res;
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return  false;     }
        return pathSum(root,root.val,targetSum);
//         int sum=root.val;
//         while(root.left!=null || root.right!=null){
//             if(sum==targetsum && (root.left==null && root.right==null)){
//                 return true;
//             }
//             if(root.left!=null){
//                 pathSum(root.left,sum+root.left.val,targetsum);
//              }
//             if(root.right!=null){
//                 pathSum(root.right,sum+root.right.val,targetsum);    
//             }
//         }
//         return false;
        
    }
}