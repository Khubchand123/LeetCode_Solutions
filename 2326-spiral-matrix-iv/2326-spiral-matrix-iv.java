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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(matrix[i],-1);
        }
        int maxR=m-1;
        int minR=0;
        int maxC=n-1;
        int minC=0;
        int total=m*n;
        int count=0;
        while(count<total && head!=null){
            for(int i=minC;i<=maxC && count < total;i++){
                if(head!=null){
                    matrix[minR][i]=head.val;
                    head=head.next;
                }
            }
            minR++;
            for(int i=minR;i<=maxR && count < total;i++){
                if(head!=null){
                matrix[i][maxC]=head.val;
                head=head.next;
                }
            }
            maxC--;
            for(int i=maxC;i>=minC && count < total;i--){
                if(head!=null){
                matrix[maxR][i]=head.val;
                head=head.next;
                }
            }
            maxR--;
            for(int i=maxR;i>=minR && count < total;i--){
                if(head!=null){
                matrix[i][minC]=head.val;
                head=head.next;
                }
            }
            minC++;
        }
        return matrix;
    }
}