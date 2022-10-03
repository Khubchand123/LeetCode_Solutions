class Solution {
    public int maximum69Number (int num) {
        String s1="";
        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                s1+="9"+s.substring(i+1,s.length());
                break;
            }
            else{
                s1+=s.substring(i,i+1);
            }
        }
        return Integer.parseInt(s1);
    }
}