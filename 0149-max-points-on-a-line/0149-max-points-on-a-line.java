class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        Map<Double,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j=0;j<n;j++){
                if(i!=j){
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    double m=0;
                    if(x1==x2){
                        m=Double.POSITIVE_INFINITY;
                    }
                    else{
                        m=((y2-y1)/(double)(x2-x1));
                    }
                    if(map.containsKey(m)){
                        map.put(m,map.get(m)+1);
                        max = Math.max(max,map.get(m));
                    }
                    else{
                        map.put(m,1);
                        max = Math.max(max,1);
                    }
                }
            }
            map.clear();
        }
        return max+1;
    }
}