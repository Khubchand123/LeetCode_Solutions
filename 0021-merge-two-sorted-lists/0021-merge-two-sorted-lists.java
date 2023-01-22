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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1!=null || l2!=null){
            if(l1==null){
                temp.next=l2;
                break;
            }
            else if(l2==null){
                temp.next=l1;
                break;
            }
            else if(l1.val<l2.val){
                temp.next = new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                temp.next = new ListNode(l2.val);
                l2=l2.next;
            }
            temp=temp.next;
        }
        return head.next;
        
    }
}