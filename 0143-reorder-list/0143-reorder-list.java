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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        int c=0;
        if(fast!=null){
            c=1;
        }
        ListNode temp=slow;
        ListNode prev=null;
        while(temp!=null){
            ListNode cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        ListNode first=head;
        temp=prev;
        while(temp!=null){
            ListNode cur=first.next;
            ListNode cur1=temp.next;
            first.next=temp;
            first=first.next;
            first.next=cur;
            first=first.next;
            temp=cur1;
        }
        if(c==0) {
            first.next=null;
        }
    }
}