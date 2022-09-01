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
    public ListNode reverse(ListNode head1, int l){
        ListNode cu = head1;
        ListNode prev=null;
        while(l>0){
            ListNode temp1 = cu.next;
            cu.next=prev;
            prev=cu;
            cu=temp1;
            l--;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int m=k;
        while(m!=0 && curr!=null){
            curr=curr.next;
            m--;
        }
        if(curr==null && m!=0){
            return head;
        }
        else{
            ListNode res = reverse(head,k);
            ListNode temp = res;
            while(temp.next!=null){
                temp=temp.next;
                
            }
            temp.next=reverseKGroup(curr,k);
            return res;
            
        }
        
    }
}