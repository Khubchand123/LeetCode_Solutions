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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(temp!=null){
            int k=temp.val;
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
            temp=temp.next;
        }
        temp=head;
        ListNode ans = new ListNode();
        while(temp!=null){
            int k=temp.val;
            if(map.get(k)>1){
                // temp.next=temp.next.next;
            }
            else{
                ans=new ListNode(temp.val,ans);
                // temp=temp.next;
            }
            temp=temp.next;
        }
        ListNode prev=null;
        temp=ans;
        while(temp!=null){
            ListNode cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        return prev.next;
        
    }
}