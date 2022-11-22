class Solution {
    public int countPrimes(int n) {
        if(n==0){
            return 0;
        }
        int arr[] = new int[n];
        for(int i=0;i<=n/2;i++){
            if(arr[i]==0){
                if(i==0 || i==1){
                    arr[i]=1;
                }
                else{
                    for(int j=2*i;j<n;j+=i){
                        arr[j]=1;
                    }
                }
            }
        }
        int count=0;
        for(int i:arr){
            if(i==0){
                count++;
            }
        }
        return count;
    }
}