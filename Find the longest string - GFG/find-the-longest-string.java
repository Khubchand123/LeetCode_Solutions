//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
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
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        HashSet<String> hs=new HashSet<>();
        for(int x=0;x<n;x++)
        {
            hs.add(arr[x]);
        }
        Arrays.sort(arr);
        int max=-1;
        int prev=-1;
        int count=0;
        String ans="";
        int flag=0;
        for(String x:arr)
        {
            count=0;
            String s="";
            flag=0;
            for(int y=0;y<x.length();y++)
            {
                s=s+x.charAt(y);
                if(hs.contains(s))
                {
                    count++;
                }
    			else
    			{
    				flag=1;
    				break;
    			}
            }
            if(flag==0)
            {
                max=Math.max(max,count);
                if(max!=prev)
                {
                    ans=x;
                    prev=max;
                }
              
            }
        }
        return ans; 
    }
}
        
