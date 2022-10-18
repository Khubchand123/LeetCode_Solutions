/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                // 1. Brute Force Algorithm (time taking around 500ms)
//         ListNode temp1=headA;
//         ListNode temp2=headB;
//         while(temp1!=null){
//             while(temp2!=null){
//                 if(temp1==temp2){
//                     return temp1;
//                 }
//                 temp2=temp2.next;
//             }
//             temp1=temp1.next;
//             temp2=headB;
//         }
        
//         return null;
        
        // 2. Best Approach (time taking around 10ms)
        
        ListNode temp=headA;
        int sizeA=0;
        while(temp!=null){
            sizeA++;
            temp=temp.next;
        }
        int sizeB=0;
        temp=headB;
        while(temp!=null){
            sizeB++;
            temp=temp.next;
        }
        if(sizeA>sizeB){
            int dif=sizeA-sizeB;
            while(dif--!=0){
                headA=headA.next;
            }
        }
        else{
           int dif=sizeB-sizeA;
           while(dif--!=0){
               headB=headB.next;
           } 
        }
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}