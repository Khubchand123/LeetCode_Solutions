class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }
        char[] arr=s.toCharArray();
        char[] arr1=new char[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[n-1-i];
        }
        int[][] dp= new int[n+1][n+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(arr[i-1]==arr1[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                
                else dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[n][n];
    }
}