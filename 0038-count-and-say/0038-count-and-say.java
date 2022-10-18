class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String sa=countAndSay(n-1);
       String ans="";
        int co=0;
        for(int i=0;i<sa.length();i++){
             int c=1;
            for(int j=i+1;j<sa.length();j++){
                if(sa.charAt(i)==sa.charAt(j)){
                    c++;
                    i++;
                }
                else{
                   // co=j;
                    break;
                }
            }
           ans= ans+c+sa.charAt(i);
            // i=c;
        }
        return ans;
    }
}