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
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode cur=slow.next;
            slow.next=prev;
            prev=slow;
            slow=cur;
            count+=2;
            
        }
        if(fast!=null){
            slow=slow.next;
        }
        // if()
        // slow=slow.next;
        while(slow!=null){
            if(slow.val!=prev.val){
                return false;
            }
            slow=slow.next;
            prev=prev.next;
        }
        return true;
    }
}