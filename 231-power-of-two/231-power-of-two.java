class Solution {
    public boolean isPowerOfTwo(int n) {
        
        
    // 1. solution
        
        // if(n==1){
        //     return true;
        // }
        // int left=0;
        // int right=n;
        // int mid=n/2;
        // while(left<right){
        //     if(Math.pow(2,mid)==n){
        //         return true;
        //     }
        //     else if(Math.pow(2,mid)>n){
        //         right=mid;
        //     }
        //     else{
        //         left=mid;
        //     }
        //     if(mid==(left+right)/2){
        //         break;
        //     }
        //     mid=(left+right)/2;
        // }
        // return false;
    // 2. Solutiom
        if(n==0){
            return false;
        }
        long x=(long)n;
        return (x&(x-1))==0;
    }
}