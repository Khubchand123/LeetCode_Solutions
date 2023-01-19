//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        
        int count=0;
        if(B>A){
            int temp=B;
            B=A;
            A=temp;
        }
        if(D>C){
            int temp=C;
            C=D;
            D=temp;
        }
        while(A>C || B>D){
            count++;
            if(A>C){
                A/=2;
            }
            else if(B>D){
                B/=2;
            }
            if(B>A){
                int temp=B;
                B=A;
                A=temp;  
            }
        }
        return count;
    }
   
}
