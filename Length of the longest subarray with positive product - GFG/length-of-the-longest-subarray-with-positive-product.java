//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
        int ans=0;
        int lp=0;
        int ln=0;
        for(int i:arr){
            if(i==0){
                lp=0;
                ln=0;
            }
            else if(i>0){
                lp+=1;
                if(ln>0){
                    ln++;
                }
            }
            else{
                int temp = lp;
                lp = (ln > 0 ? ln + 1 : 0);
                ln = temp + 1;
            }
            ans = Math.max(ans,lp);
        }
        return ans;
    }
   
}