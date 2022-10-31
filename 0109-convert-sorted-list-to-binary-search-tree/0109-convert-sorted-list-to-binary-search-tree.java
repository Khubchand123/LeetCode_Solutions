/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static TreeNode helper(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left=helper(arr,low,mid-1);
        root.right=helper(arr,mid+1,high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int arr[] = new int[n];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        return helper(arr,0,n-1);
    }
}