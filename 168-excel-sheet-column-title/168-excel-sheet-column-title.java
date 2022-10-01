class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String s="";
        while(n>0){
            char c='A';
            if(n%26==0){
                c='Z';
                n=n/26-1;
            }
            else{
                int a=64+n%26;
                c=(char)a;
                n=n/26;
            }
            s=c+s;
         }
        return s;
    }
}