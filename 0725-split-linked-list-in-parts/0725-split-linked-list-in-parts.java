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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int minElement=length/k;
        int remainElement=length%k;
        ListNode[] ans = new ListNode[k];
        int idx=0;
        temp=head;
        while(temp!=null){
            ListNode obj = new ListNode(temp.val);
            temp=temp.next;
            ListNode tem=obj;
            int p=minElement;
            if(remainElement>0){
                p++;
                remainElement--;
            }
            for(int i=0;i<p-1;i++){
                tem.next=new ListNode(temp.val);
                tem=tem.next;
                temp=temp.next;
            }
            ans[idx++]=obj;
        }
        return ans;
    }
}