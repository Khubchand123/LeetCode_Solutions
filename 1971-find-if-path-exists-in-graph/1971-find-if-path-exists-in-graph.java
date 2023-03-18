class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int n1 = edges.length;
        boolean vis[] = new boolean[n];
        Map<Integer,Map<Integer,Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new HashMap<>());
        }
        for(int i=0;i<n1;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            graph.get(a).put(b,0);
            graph.get(b).put(a,0);
        }
        return checkPath(graph,vis,source,destination);
    }
    public boolean checkPath(Map<Integer,Map<Integer,Integer>> graph,boolean vis[],int src,int des){
        if(src==des){
            return true;
        }
        vis[src]=true;
        for(int i:graph.get(src).keySet()){
            if(!vis[i]){
                if(checkPath(graph,vis,i,des)){
                    return true;
                }
            }
        }
        return false;
    }
}