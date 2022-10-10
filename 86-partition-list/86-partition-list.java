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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode temp1=new ListNode();
        ListNode temp2=new ListNode();
        ListNode cur = head;
        while(cur!=null){
            if(cur.val<x){
                temp1=new ListNode(cur.val,temp1);
            }
            else{
                temp2=new ListNode(cur.val,temp2);
            }
            cur=cur.next;
        }
        cur=temp1;
        ListNode prev1=null;
        while(cur.next!=null){
            ListNode temp=cur.next;
            cur.next=prev1;
            prev1=cur;
            cur=temp;
        }
        
        cur=temp2;
        ListNode prev2=null;
        while(cur.next!=null){
            ListNode temp=cur.next;
            cur.next=prev2;
            prev2=cur;
            cur=temp;
        }
        if(prev1==null){
            return prev2;
        }
        cur=prev1;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=prev2;
        return prev1;
    }
}