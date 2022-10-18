class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        else if(n==2){
            return "11";
        }
        String s=countAndSay(n-1);
        String s1="";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                s1+=Integer.toString(count)+s.substring(i,i+1);
                count=1;
            }
        }
        if(s.charAt(s.length()-1)==s.charAt(s.length()-2)){
                s1+=Integer.toString(count)+s.substring(s.length()-1);
        }
        else{
            s1+="1"+s.substring(s.length()-1,s.length());
        }
        return s1;
    }
}