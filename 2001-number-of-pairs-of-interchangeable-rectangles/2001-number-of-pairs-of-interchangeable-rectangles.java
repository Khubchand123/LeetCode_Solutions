class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Long>  map = new HashMap<>();
        long sum=0;
        for(int[] i:rectangles){
            double k = (double)i[0]/i[1];
            if(map.containsKey(k)){
                long value=map.get(k)+(long)1;
                map.put(k,value);
            }
            else{
                map.put(k,(long)1);
            }
        }
        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
 
            Map.Entry mapElement= (Map.Entry)hmIterator.next();
            long n = (long)mapElement.getValue();
            sum+=(n*(n-1)/2);
        }
        return sum;
    }
}