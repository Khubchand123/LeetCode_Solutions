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
    public ListNode insertionSortList(ListNode head) {
        ListNode ans =null;
        
        ListNode temp2=ans;
        while(head!=null){
            ListNode temp = head;
            int k = Integer.MAX_VALUE;
            while(temp!=null){
                if(k>temp.val){
                    k=temp.val;
                }
                temp=temp.next;
            }
            if(k==head.val){
                head=head.next;
            }
            else{
                temp=head;
                while(temp!=null){
                    if(k==temp.next.val){
                        temp.next=temp.next.next;
                        break;
                    }
                    else{
                        temp=temp.next;
                    }
                }
            }
            if(ans==null){
                ans = new ListNode(k);
                temp2=ans;
            }
            else{
                temp2.next = new ListNode(k);
                temp2=temp2.next;
            }
        }
        return ans;
    }
}