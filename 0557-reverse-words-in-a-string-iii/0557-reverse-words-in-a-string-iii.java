class Solution {
    public String reverseWords(String s) {
        String ans="";
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+=s1+" ";
                s1="";
            }
            else{
                s1=s.substring(i,i+1)+s1;
            }
            
        }
        ans+=s1;
        return ans;
    }
    
    

}