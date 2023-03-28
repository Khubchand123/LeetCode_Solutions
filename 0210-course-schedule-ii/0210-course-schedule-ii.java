class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new HashSet<>());
        }
        for(int i[]:prerequisites){
            map.get(i[1]).add(i[0]);
        }
        
        return TopologicalSort(map);
    }
    public int[] TopologicalSort(Map<Integer, Set<Integer>> map) {
            int[] course = new int[map.size()];
			int idx = 0;
			int[] in = indegree(map);
			Queue<Integer> q = new LinkedList<>();
			for (int i = 0; i < in.length; i++) {
				if (in[i] == 0) {
					q.add(i);
				}
			}
			int count = 0;
			while (!q.isEmpty()) {
				int rv = q.remove();
                course[idx++]=rv;
				count++;
				for (int nbrs : map.get(rv)) {
					in[nbrs]--;
					if (in[nbrs] == 0) {
						q.add(nbrs);
					}
				}

			}
			return count==map.size()?course:new int[0];

		}
    int[] indegree(Map<Integer,Set<Integer>> map){
        int[] in = new int[map.size() ];
			for (int key : map.keySet()) {
				for (int nbrs : map.get(key)) {
					in[nbrs]++;
				}
			}
			return in;
    }
}