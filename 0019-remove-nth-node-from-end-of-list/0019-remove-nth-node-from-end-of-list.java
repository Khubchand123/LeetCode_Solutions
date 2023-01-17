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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1){
            return null;
        }
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int k=size-n;
        if(k==0){
            return head.next;
        }
        temp=head;
        while(k>1){
            k--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}