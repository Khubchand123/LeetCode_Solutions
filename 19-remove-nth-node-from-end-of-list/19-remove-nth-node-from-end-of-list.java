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
        ListNode first=head;
        ListNode second=null;
        while(first!=null){
            second=new ListNode(first.val,second);
            first=first.next;
        }
        while(second!=null){
            n--;
            if(n==0){
                
            }
            else{
                first=new ListNode(second.val,first);
            }
            second=second.next;
        }
        return first;
    }
}