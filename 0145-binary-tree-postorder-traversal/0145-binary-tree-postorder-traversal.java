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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> obj = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null){
            while(temp!=null){
                stack.push(temp);
                obj.add(0,temp.val);
                temp=temp.right;
            }
            temp = stack.pop().left;
        }
//         while(!stack.empty() || curr!=null){

//             while(curr!=null){
//                 stack.push(curr);
//                 // ans.addFirst(curr.val);
//                 ans.add(0,curr.val);
//                 curr = curr.right;
//             }

//             TreeNode node = stack.pop();
//             curr = node.left;
//         }
        return obj;
    }
}