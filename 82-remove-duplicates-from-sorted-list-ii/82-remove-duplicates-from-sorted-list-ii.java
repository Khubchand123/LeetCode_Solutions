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
        // counting the repeated nodes
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
        // Adding non-duplicate node in new ListNode
        while(temp!=null){
            int k=temp.val;
            if(map.get(k)>1){
            }
            else{
                ans=new ListNode(temp.val,ans);
            }
            temp=temp.next;
        }
        
        ListNode prev=null;
        temp=ans;
        // reversing ans node
        while(temp!=null){
            ListNode cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        return prev.next;
        
    }
}