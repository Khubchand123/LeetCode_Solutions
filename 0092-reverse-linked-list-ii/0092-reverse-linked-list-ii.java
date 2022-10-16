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
        // ListNode initial;
        ListNode prev=null;
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
        // return prev;
        ListNode cur=prev;
        while(cur.next!=null){
            cur=cur.next;
        }
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