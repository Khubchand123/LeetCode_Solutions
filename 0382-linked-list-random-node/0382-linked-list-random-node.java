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
    List<Integer> obj;
    int size;
    public Solution(ListNode head) {
        obj=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            obj.add(temp.val);
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        size=obj.size();
        int rand = (int)(Math.random() * (size));
        return obj.get(rand);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */