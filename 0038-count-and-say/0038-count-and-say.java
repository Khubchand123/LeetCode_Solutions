class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
        String ans="";
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.substring(i-1,i).equals(s.substring(i,i+1))){
                count++;
            }
            else{
                ans+=Integer.toString(count)+s.substring(i-1,i);
                count=1;
            }
        }
        ans+=count+s.substring(s.length()-1,s.length());
        return ans;
    }
    
}