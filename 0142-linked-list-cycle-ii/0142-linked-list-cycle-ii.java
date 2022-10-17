/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast==null || fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        ListNode temp=head;
        while(true){
            if(slow==temp){
                return temp;
                
            }
            slow=slow.next;
            temp=temp.next;
        }
    }
}