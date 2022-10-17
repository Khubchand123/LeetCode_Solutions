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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode tempInitial= head;
        ListNode tempEnd= head;
        while(temp!=null){
            if(k>=2){
                tempInitial=tempInitial.next;
            }
            if(k<1){
                tempEnd=tempEnd.next;
            }
            temp=temp.next;
            k--;
        }
        int m=tempInitial.val;
        tempInitial.val=tempEnd.val;
        tempEnd.val=m;
        return head;
    }
}