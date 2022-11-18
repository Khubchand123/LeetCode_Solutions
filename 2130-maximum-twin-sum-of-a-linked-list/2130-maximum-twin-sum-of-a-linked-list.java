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
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode temp=slow;
        while(temp!=null){
            ListNode cur = temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        temp=head;
        int ans=0;
        while(temp!=null && prev!=null ){
            int k=temp.val+prev.val;
            ans=ans>k?ans:k;
            temp=temp.next;
            prev=prev.next;
        }
        return ans;
    }
}