class Solution {
    public int arrangeCoins(int n) {
        long k=1;
        long m=(long)n;
        // int sum=1;
        while(true){
            if((k*(k+1))>2*m){
                break;
            }
            k++;
        }
        return (int)k-1;
    }
}