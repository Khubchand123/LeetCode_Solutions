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
    
    public int pathSum(TreeNode root, int targetSum) {

			if (root == null) {
				return 0;
			}

			int root_sum = countnumberofpath(root,0, targetSum);

			int left = pathSum(root.left,targetSum);
			int right = pathSum(root.right,targetSum);
			return root_sum + left + right;

		}

		public int countnumberofpath(TreeNode root,long sum, int targetSum) {

			if (root == null) {
				return 0;
			}
			int ans = 0;
			if (sum + (long)root.val == (long)targetSum) {
				ans++;
			}
			ans = ans + countnumberofpath(root.left,sum+(long)root.val, targetSum);
			ans = ans + countnumberofpath(root.right,sum+(long)root.val, targetSum);
			return ans;

		}
}