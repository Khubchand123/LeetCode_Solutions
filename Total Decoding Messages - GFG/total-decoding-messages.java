//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        // code here
        if(str.length()==1){
            if(str.charAt(0)>'0' && str.charAt(0)<='9'){
                return 1;
            }
            else{
                return 0;
            }
        }
        int dp[] = new int[str.length()+1];
        dp[0] =1;
        if(str.charAt(0)!='0'){
            dp[1]=1;
        }
        int mod=1000000007;
        for(int i=2;i<=str.length();i++){
            int a = Integer.parseInt(str.substring(i-1,i));
            int b = Integer.parseInt(str.substring(i-2,i));
            if(a>=1 && a<=9){
                dp[i]=dp[i-1];
            }
            if(b>=10 && b<=26){
                dp[i]=(dp[i]+dp[i-2])%mod;
            }
        }
        return dp[str.length()];
    }
}