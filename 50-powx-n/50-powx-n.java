class Solution {
    public double myPow(double x, int n) {
        if(x==1 || n==0){
            return 1;
        }
        if(x==-1){
            if(n%2==0){
                return 1;
            }
            else{
                return -1;
            }
        }
        double res=1;
        if(n<0){
            // n=(-1)*n;
            while(n<0 && res!=0){
                res/=x;
                n++; 
            }
        }
        else{
            while(n>0){
                res*=x;
                n--;
            }
        }
        return res;
    }
}