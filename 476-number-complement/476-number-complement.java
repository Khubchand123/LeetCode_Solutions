class Solution {
    public int findComplement(int num) {
        int comp=0;
        int mul=1;
        while(num>0){
            int rem=num%2;
            if(rem==1){
                rem=0;
            }
            else{
                rem=1;
            }
            comp+=rem*mul;
            mul*=2;
            num=num/2;
        }
        return comp;
    }
}