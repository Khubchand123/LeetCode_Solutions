//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> obj = new ArrayList<>();
        int i=0;
        while(i<N){
            int k=0;
            int j=i;
            while(j>=0){
                obj.add(A[k][j]);
                j--;
                k++;
            }
            i++;
        }
        i=1;
        while(i<N){
            int k=i;
            int j=N-1;
            while(j>=i){
                obj.add(A[k][j]);
                j--;
                k++;
            }
            i++;
        }
        return obj;
    }
}
