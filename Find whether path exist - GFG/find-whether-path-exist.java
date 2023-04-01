//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        // Code here
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return helper(grid,i,j,m,n);
                }
            }
        }
        return false;
    }
    static boolean helper(int[][] grid,int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return false;
        }
        if(grid[i][j]==2){
            return true;
        }
        grid[i][j]=0;
        boolean left=helper(grid,i+1,j,m,n);
        boolean right=helper(grid,i-1,j,m,n);
        boolean up=helper(grid,i,j+1,m,n);
        boolean down=helper(grid,i,j-1,m,n);
        return left || right || up || down;
    }
}