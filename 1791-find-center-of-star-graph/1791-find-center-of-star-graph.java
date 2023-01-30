class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int arr[] = new int[n+2];
        for(int[] edge:edges){
            arr[edge[0]]++;
            arr[edge[1]]++;
            if(arr[edge[0]]>1){
                return edge[0];
            }
            if(arr[edge[1]]>1){
                return edge[1];
            }
        }
        return -1;
    }
}