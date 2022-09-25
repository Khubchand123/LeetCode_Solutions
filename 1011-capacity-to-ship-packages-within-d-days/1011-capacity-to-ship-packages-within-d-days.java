class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        int j=-1;
        int count=0;
        while(count!=days){
            for(int i=0;i<weights.length;i++){
                int sum=0;
                while(i!=weights.length && sum+weights[i]<=max){
                    sum+=weights[i];
                    i++;
                }
               i--;
                count++;
            }
            if(count<=days){
                 break;
            }
            count=0;
            max++;
        }
        return max;
    }
}