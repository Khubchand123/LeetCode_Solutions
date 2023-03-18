class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new HashSet<>());
        }
        for(int i[]:prerequisites){
            map.get(i[1]).add(i[0]);
        }
        int vis[] = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            // if(!vis[i]){
                if(detectCycle(map,vis,i)){
                    return false;
                }
            // }
        }
        return true;
    }
    boolean detectCycle(Map<Integer,Set<Integer>> map,int vis[],int i){
        if(vis[i]==2){
            return true;
        }
        vis[i] = 2;
        for(int nbrs:map.get(i)){
            if(vis[nbrs]!=1){
                if(detectCycle(map,vis,nbrs)){
                    return true;
                }
            }
        }
        vis[i]=1;
        return false;
        
    }
}