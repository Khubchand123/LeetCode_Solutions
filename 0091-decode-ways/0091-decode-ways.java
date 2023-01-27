class Solution {
    public int numDecodings(String s) {
        if(s.length()==1){
            if(s.charAt(0)>'0' && s.charAt(0)<='9'){
                return 1;
            }
            else{
                return 0;
            }
        }
        int dp[] = new int[s.length()+1];
        dp[0] =1;
        if(s.charAt(0)!='0'){
            dp[1]=1;
        }
        for(int i=2;i<=s.length();i++){
            int a = Integer.parseInt(s.substring(i-1,i));
            int b = Integer.parseInt(s.substring(i-2,i));
            if(a>=1 && a<=9){
                dp[i]+=dp[i-1];
            }
            if(b>=10 && b<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];
    }
}