class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans = new int[n];
        for(int i=0;i<n-1;i++){
            int count=0;
            int p=0;
            for(int j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    p=1;
                    count++;
                    break;
                }
                else{
                    count++;
                }
                
            }
            if(p==1){
                ans[i]=count;
            }
            else{
                ans[i]=0;
            }
        }
        ans[n-1]=0;
        return ans;
    }
}