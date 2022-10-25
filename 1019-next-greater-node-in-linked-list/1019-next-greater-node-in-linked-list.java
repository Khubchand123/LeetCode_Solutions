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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int arr[] = new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        // int max=arr[count-1];
        Stack<Integer> stack  = new Stack<>();
        for(i=count-1;i>=0;i--){
            int k=arr[i];
            while(!stack.isEmpty() && k>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i]=0;
            }
            else{
                arr[i]=stack.peek();
            }
            stack.push(k);
            
        }
        return arr;
        
    }
}