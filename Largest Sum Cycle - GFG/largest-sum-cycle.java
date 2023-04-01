//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long largesSumCycle(int N, int Edge[]){
        Queue<Integer> queue = new LinkedList<>();
        int[] in = new int[N];
        for(int i=0;i<N;i++){
            if(Edge[i]==-1){
                continue;
            }
            in[Edge[i]]++;
        }
        for(int i=0;i<N;i++){
            if(in[i]==0){
                queue.add(i);
            }
        }
        boolean visited[] = new boolean[N];
        while(!queue.isEmpty()) {
				int rv = queue.poll();
				visited[rv]=true;
				int nbrs = Edge[rv];
				if(nbrs!=-1) {
					in[nbrs]--;
					if(in[nbrs]==0) {
						queue.add(nbrs);
					}
				}
					
			}
			//count wala part
			int ans=-1;
			for (int i = 0; i < visited.length; i++) {
				if(!visited[i]) {
					int count=i;
					int nbrs = Edge[i];
					visited[i]=true;
					while(nbrs!=i) {
						visited[nbrs]=true;
						count+=nbrs;
					 nbrs = Edge[nbrs];
					}
					ans = Math.max(ans, count);
				}
			}
			return ans;
        
    }
    
}