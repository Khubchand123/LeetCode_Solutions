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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode cur=null;
        while(fast!=null && fast.next!=null){
            cur=slow;
            fast=fast.next.next;
            slow=slow.next;
            
        }
        cur.next=slow.next;
        return head;
    }
}