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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        
         // creting arraylist
        List<Integer> obj = new ArrayList<>();
          // add list value in arraylist
        while(head!=null){
            obj.add(head.val);
            head=head.next;
        }
            // sort arraylist
        Collections.sort(obj);
            // adding this value in head
        head=new ListNode(obj.get(0));
        ListNode temp=head;
        for(int i=1;i<obj.size();i++){
            temp.next=new ListNode(obj.get(i));
            temp=temp.next;
        }
        return head;
    }
}