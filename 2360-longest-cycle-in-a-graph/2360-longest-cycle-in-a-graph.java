class Solution {
    public int longestCycle(int[] edges) {
        int in[]=new int[edges.length];
        for(int i:edges){
            if(i==-1)continue;
            in[i]++;
        }
        boolean v[]=new boolean[edges.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<edges.length;i++){
            if(in[i]==0)q.add(i);
        }
        while(!q.isEmpty()){
            int f=q.poll();
            v[f]=true;
            if(edges[f]==-1)continue;
            in[edges[f]]--;
            if(in[edges[f]]==0)q.add(edges[f]);
        }
        int ans=-1;
        for(int i=0;i<edges.length;i++){
            if(v[i])continue;
            int ct=1;
            int nb=edges[i];
            while(nb!=i){
                ct++;
                v[nb]=true;
                nb=edges[nb];
            }
            ans=Math.max(ans,ct);
        }
        return ans;
    }
}