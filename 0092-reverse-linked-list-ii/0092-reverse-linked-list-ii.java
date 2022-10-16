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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int p=left;
        int q=right;
        ListNode temp=head;
        ListNode prev=null;
                 // making rev node from left to right
        while(q--!=0){
            if(p<=1){
                ListNode cur=temp.next;
                temp.next=prev;
                prev=temp;
                temp=cur;
            }
            else{
                temp=temp.next;
            }
            p--;
        }
        ListNode cur=prev;
             // iterate prev upto last elemnt
        while(cur.next!=null){
            cur=cur.next;
        }
             // putting after right element in prev last node
        cur.next=temp;
        if(left==1){
            return prev;
        }
        
        else{
            temp=head;
            while(left!=2){
                temp=temp.next;
                left--;
            }
            temp.next=prev;
        }
        
        return head;
    }
}