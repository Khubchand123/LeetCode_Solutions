class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int v = graph.length;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<v;i++){
            map.put(i,new HashSet<>());
        }
        Set<Integer> set;
        for(int i=0;i<graph.length;i++){
             set = new HashSet<>();
            for(int j:graph[i]){
                
                set.add(j);
                
            }
            map.put(i,set);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        obj.add(0);
        helper(map,ans,obj,0,v);
        return ans;
    }
    void helper(Map<Integer,Set<Integer>> map,List<List<Integer>> ans,List<Integer> obj,int cur,int n){
        if(cur==n-1){
            ans.add(new ArrayList<>(obj));
            return;
        }
        if(map.get(cur).size()==0){
            return;
        }
        for(int i:map.get(cur)){
            obj.add(i);
            helper(map,ans,obj,i,n);
            obj.remove(obj.size()-1);
        }
    }
}