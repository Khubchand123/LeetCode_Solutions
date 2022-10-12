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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode head1=head;
        ListNode head2=head.next;
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode slow=head;
        int count=0;
        while(slow!=null){
            if(count%2==0){
                if(temp1.next.next!=null){
                    temp1.next=temp1.next.next;
                    temp1=temp1.next;
                }
                count=1;
            }
            else{
                temp2.next=temp2.next.next;
                temp2=temp2.next;
                count=0;
            }
            slow=slow.next;
            
        }
        if(temp2!=null){
            temp2.next=null;
        }
        temp1.next=head2;
        return head;
    }
}