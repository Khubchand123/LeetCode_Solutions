// How to check graph is bipartite or not
        // 1. if graph does not contain cycle it is bipartite.
        // 2. if graph contain cycle then if cycle is even vtx then graph is bipartite.
        // 3. if graph contain cycle then if cycle is odd vtx then graph is not bipartite.


class Solution {
    class BipartitePair {
		int vtx;
		int lv;   //just to check level

		public BipartitePair(int src, int lv) {
			// TODO Auto-generated constructor stub
			this.vtx = src;
			this.lv = lv;
		}
	}
    // We use BFT here because DFT not detect cycle by levelwise. DFT will not give us the cycle is even vtx or ood vtx.
    public boolean isBipartite(int[][] graph) {
        Map<Integer, Integer> visited = new HashMap<>();
		Queue<BipartitePair> q = new LinkedList<>();
		for (int src = 0; src < graph.length; src++) {
			if (visited.containsKey(src)) {
				continue;
			}
			q.add(new BipartitePair(src, 0));
			while (!q.isEmpty()) {
					// 1. remove
			    BipartitePair rv = q.poll();// (1,0)
					// 2. if Already Visited then Ignore kro
				if (visited.containsKey(rv.vtx)) {

					if (visited.get(rv.vtx) != rv.lv)
						return false;
					else
						continue;
				}
					// 3. visited
				visited.put(rv.vtx, rv.lv);

					// 5. add nbrs
				for (int nbrs : graph[rv.vtx]) {
					if (!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs, rv.lv + 1));
					}
				}

			}
		}
		return true;
		
    }
}