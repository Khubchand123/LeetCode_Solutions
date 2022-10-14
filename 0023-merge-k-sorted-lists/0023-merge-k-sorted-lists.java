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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> obj = new ArrayList<>();
            // adding all value in list
        for(ListNode temp:lists){
            while(temp!=null){
                obj.add(temp.val);
                temp=temp.next;
            }
        }
        if(obj.size()==0){
            return null;
        }
        
            // sorting list
        Collections.sort(obj);
        ListNode ans = new ListNode(obj.get(0));
        ListNode temp=ans;
            // add list element in new Listnode
        for(int i=1;i<obj.size();i++){
            temp.next = new ListNode(obj.get(i));
            temp=temp.next;
        }
        return ans;
    }
}