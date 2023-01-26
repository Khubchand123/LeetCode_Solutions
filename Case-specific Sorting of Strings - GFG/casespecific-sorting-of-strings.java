//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        int[][] count = new int[2][26];
        StringBuffer ans = new StringBuffer();
        char[] chr = str.toCharArray();
        for(char c : chr) {
            if(c >= 'a' && c <= 'z') {
                count[0][c-'a']++;
            } else {
                count[1][c-'A']++;
            }
        }
        int i = 0, j = 0;
        for(char c : chr) {
            if(c >= 'a' && c <= 'z') {
                while(count[0][i] == 0) {
                    i++;
                }
                ans.append(Character.toString((char)(i+'a')));
                count[0][i]--;
            } else {
                while(count[1][j] == 0) {
                    j++;
                }
                ans.append(Character.toString((char)(j+'A')));
                count[1][j]--;
            }
        }
        return ans.toString();
    }
}



//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends