class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int cur=0;
        int si=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
            cur+=gas[i]-cost[i];
            if(cur<0){
                si=i+1;
                cur=0;
            }
        }
        if(total<0){
            return -1;
        }
        return si;
    }
}