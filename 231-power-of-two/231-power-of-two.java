class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int left=0;
        int right=n;
        int mid=n/2;
        while(left<right){
            if(Math.pow(2,mid)==n){
                return true;
            }
            else if(Math.pow(2,mid)>n){
                right=mid;
            }
            else{
                left=mid;
            }
            if(mid==(left+right)/2){
                break;
            }
            mid=(left+right)/2;
        }
        return false;
    }
}