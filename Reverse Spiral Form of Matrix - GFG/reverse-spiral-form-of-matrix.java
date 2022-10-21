//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] arr)
    {
        // code here
        int n=R*C-1;
        int ans[] = new int[R*C];
        int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int count = 0;
		int te = arr.length * arr[0].length;
		while (count < te) {
			for (int i = minc; i <= maxc && count < te; i++) {
				ans[n--]=arr[minr][i];
				count++;

			}
			minr++;
			for (int i = minr; i <= maxr && count < te; i++) {
				ans[n--]=arr[i][maxc];
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < te; i--) {
				ans[n--]=arr[maxr][i];
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < te; i--) {
				ans[n--]=arr[i][minc];
				count++;
			}
			minc++;

		}
		return ans;
    }
}