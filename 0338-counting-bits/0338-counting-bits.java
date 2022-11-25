class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0]=0;
        int pow=1;
        int p=2;
        for(int i=1;i<=n;i++){
            if(i%p==0){
                pow*=2;
                p*=2;
            }
            ans[i] = 1+ans[i%pow];
            
        }
        return ans;
    }
}