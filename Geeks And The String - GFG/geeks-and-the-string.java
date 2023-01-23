//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
        if(s.length()==0){
            return "-1";
        }
        String s1="";
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                s1+=s.charAt(i);
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                i++;
            }
            else{
                s1+=s.charAt(i);
            }
        }
        if(s1.length()==0){
            return "-1";
        }
        int flag=0;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==s1.charAt(i+1)){
                flag=1;
                break;
            }
        }
        
        if(flag==0){
            return s1;
        }
        else{
            return removePair(s1);
        }
        
    }
}
        
