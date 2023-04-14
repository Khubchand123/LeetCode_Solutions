//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] color = IntArray.input(br, N);
            
            
            int[] radius = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.finLength(N, color, radius);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        List<Integer> ll = new ArrayList<>();
        List<Integer> lc = new ArrayList<>();
        ll.add(color[0]);
        int j=0;
        lc.add(radius[0]);
        for(int i=1;i<N;i++){
            if(j>=0 && ll.get(j)==color[i] && lc.get(j)==radius[i]){
                ll.remove(j);
                lc.remove(j);
                j--;
            }
            else{
                ll.add(color[i]);
                lc.add(radius[i]);
                j++;
            }
        }
        return ll.size();
    }
}
        
