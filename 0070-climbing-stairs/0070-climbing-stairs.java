class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n];
        return helper(n,0,arr);
    }
    int helper(int n,int i,int[] arr){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(arr[i]!=0){
            return arr[i];
        }
        else{
            arr[i]=helper(n,i+1,arr)+helper(n,i+2,arr);
        }
        return arr[i];
    }
}