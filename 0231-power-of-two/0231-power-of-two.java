class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        long x = (long)n;
        if((x&(x-1))==0){
            return true;
        }
        return false;
    }
}