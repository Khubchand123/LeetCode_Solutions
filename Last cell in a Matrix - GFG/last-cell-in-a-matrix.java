//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int i=0;
        int j=0;
        char dir='r';
        int[] ans = new int[2];
        while(true){
            if(matrix[i][j]==0){
                if(dir=='r'){
                    j++;
                }
                else if(dir=='l'){
                    j--;
                }
                else if(dir=='d'){
                    i++;
                }
                else{
                    i--;
                }
            }
            else{
                matrix[i][j]=0;
                if(dir=='r'){
                    dir='d';
                    i++;
                }
                else if(dir=='l'){
                    dir='u';
                    i--;
                }
                else if(dir=='d'){
                    dir='l';
                    j--;
                }
                else{
                    dir='r';
                    j++;
                }
            }
            if(i>=matrix.length || i<0){
                ans[0]= i<0 ? 0:i-1;
                ans[1]= j;
                break;
            }
            if(j>=matrix[0].length || j<0){
                ans[1]= j<0 ? 0:j-1;
                ans[0]= i;
                break;
            }
        }
        return ans;
    }
}