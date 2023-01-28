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
            String s[]=in.readLine().trim().split(" ");
            String a = s[0];
            String b = s[1];
            Solution g = new Solution();
            if(g.isScramble(a,b)){
                out.println("Yes");
            }
            else{
                out.println("No");
            }
        }
        out.close();
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static HashMap<String,Boolean> map=new HashMap<>();
    static boolean scramble(String s1,String s2){
        String tmp=s1+"#"+s2;
       
        if(map.containsKey(tmp))return map.get(tmp);
        if(s1.equals(s2))return true;
        if(s1.length()<=1)return false;
        int n=s1.length();
        Boolean ans=false;
        for(int i=1;i<s1.length();i++){
            //Condition 1
            if(scramble(s1.substring(0,i),s2.substring(0,i)) && 
                scramble(s1.substring(i),s2.substring(i))){
                    ans=true;
                    break;
                }
            //Condition 2
            if(scramble(s1.substring(0,i),s2.substring(n-i)) && 
                scramble(s1.substring(i),s2.substring(0,n-i))){
                    ans=true;
                    break;
            }
        }
        map.put(tmp,ans);
        return ans;
    }
    static boolean isScramble(String S1,String S2)
    {
        if(S1.length()!=S2.length())return false;
        return scramble(S1,S2);
    }
}
