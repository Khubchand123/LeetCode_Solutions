//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int n1 = A.length();
        int n2 = B.length();
        // int i=0;
        // int j=0;
        for(int i=0;i<n1;i++){
            int ans=0;
            int count=1;
            if(A.charAt(i)==B.charAt(0)){
                int k=i;
                int m=0;
                // int ans=0;
                while(k<n1 && A.charAt(k)==B.charAt(m)){
                    if(m==n2-1){
                        ans=1;
                        break;
                    }
                    k++;
                    if(k==n1){
                        count++;
                    }
                    k=k%n1;
                    m++;
                }
            }
            if(ans==1){
                return count;
            }
        }
        return -1;
    }
};