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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        Stack<Integer> obj1 = new Stack<>();
        Stack<Integer> obj2 = new Stack<>();
        while(t1!=null){
            obj1.push(t1.val);
            t1=t1.next;
        }
        while(t2!=null){
            obj2.push(t2.val);
            t2=t2.next;
        }
        ListNode ans = null;
        int carry=0;
        while(!obj1.isEmpty() || !obj2.isEmpty()){
            if(obj1.isEmpty()){
                int k=obj2.pop();
                ans=new ListNode((k+carry)%10,ans);
                carry=(k+carry)/10;
            }
            else if(obj2.isEmpty()){
                int k=obj1.pop();
                ans=new ListNode((k+carry)%10,ans);
                carry=(k+carry)/10;
            }
            else{
                int k=obj1.pop()+obj2.pop();
                ans=new ListNode((k+carry)%10,ans);
                carry=(k+carry)/10;
            }
        }
        if(carry==1){
            ans=new ListNode(1,ans);
        }
        return ans;
    }
}