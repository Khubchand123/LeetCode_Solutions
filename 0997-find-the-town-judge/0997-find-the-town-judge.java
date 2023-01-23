class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[][] = new int[n+1][n+1];
        for(int i[]:trust){
            int a=i[0];
            int b=i[1];
            arr[b][a]++;
        }
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=n;j++){
                if(arr[i][j]!=0 && i!=j){
                    count++;
                }
            }
            if(count==n-1){
                int c=0;
                for(int j=1;j<=n;j++){
                    if(arr[j][i]!=0 && j!=i){
                        c++;
                    }
                }
                if(c==0){
                    return i;
                }
                // return i;
            }
        }
        return -1;
    }
}