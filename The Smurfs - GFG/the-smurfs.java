//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
        int r=0;
        int b=0;
        int g=0;
        for(String s:a){
            if(s.equals("R")){
                r++;
            }
            else if(s.equals("G")){
                g++;
            }
            else{
                b++;
            }
        }
        if(r==n || g==n || b==n){
            return n;
        }
        if((r%2==0 && g%2==0 && b%2==0) || (r%2==1 && g%2==1 && b%2==1)){
            return 2;
        }
        return 1;
    }
    
}