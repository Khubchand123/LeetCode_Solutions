class Solution {
    public int getMaxLen(int[] nums) {
        int ans=0;
        int lp=0;
        int ln=0;
        for(int i:nums){
            if(i==0){
                lp=0;
                ln=0;
            }
            else if(i>0){
                lp+=1;
                if(ln>0){
                    ln++;
                }
            }
            else{
                int temp = lp;
                lp = (ln > 0 ? ln + 1 : 0);
                ln = temp + 1;
            }
            ans = Math.max(ans,lp);
        }
        return ans;
    }
}