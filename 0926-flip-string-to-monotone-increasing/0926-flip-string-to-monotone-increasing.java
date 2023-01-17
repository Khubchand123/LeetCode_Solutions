class Solution {
    public int minFlipsMonoIncr(String s){
        int n = s.length();
        int zero = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
        }
        int ans = zero;
        int one = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero--;
            }
            else{
                one++;
            }
            ans = Math.min(ans,zero+one);
        }
        return ans;
    }
}