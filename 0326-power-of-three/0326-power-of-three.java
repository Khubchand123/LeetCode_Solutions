class Solution {
    public boolean isPowerOfThree(int n) {
        while(true){
            if(n==1){
                return true;
            }
            if(n%3!=0 || n==0){
                return false;
            }
            n=n/3;
        }
    }
}