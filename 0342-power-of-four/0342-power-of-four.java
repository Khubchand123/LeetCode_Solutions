class Solution {
    public boolean isPowerOfFour(int n) {
        while(true){
            if(n==1){
                return true;
            }
            if(n%4!=0 || n==0){
                return false;
            }
            n=n/4;
        }
    }
}