//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            int[] ptr = ob.satisfyEqn(A,N);
            
            System.out.println(ptr[0] + " " + ptr[1] + " " + ptr[2] + " " + ptr[3]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        int INF = Integer.MAX_VALUE;
        int[] ans = {INF, INF, INF, INF};
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for(int i = 0; i< N; i++){
            for(int j = i+1; j < N; j++ ){
                int sum = A[i]+A[j];
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new int[]{i, j});
            }
        }
        for(List<int[]> list : map.values()){
            if(list.size() >= 2){
                int a = list.get(0)[0];
                int b = list.get(0)[1];
                for(int i = 1; i<list.size(); i++){
                    int c = list.get(i)[0];
                    int d = list.get(i)[1];
                    if(a == c || a == d || b == c || b == d){
                        continue;
                    }
                    if(a < ans[0]) {
                        ans = new int[]{a,b,c,d};
                    }
                    else if(a == ans[0] && b < ans[1]) {
                        ans = new int[]{a,b,c,d};
                    }
                    else if(a == ans[0] && b == ans[1] && c < ans[2]) {
                        ans = new int[]{a,b,c,d};
                    }
                    else if(a == ans[0] && b == ans[1] && c == ans[2] && d < ans[3]){
                        ans = new int[]{a,b,c,d};
                    }
                }
            }
        }
        if(ans[0] == INF){
            ans = new int[]{-1,-1,-1,-1};
        }
        return ans; // code here
    }
};