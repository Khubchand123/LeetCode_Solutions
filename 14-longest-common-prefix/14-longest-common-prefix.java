class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        String s1=strs[0];
        for(int i=1;i<strs.length;i++){
            if(s1.length()>strs[i].length()){
                s1=strs[i];
            }
        }
        for(int i=0;i<strs.length;i++){
            String s2="";
            int j=0;
            while(j<s1.length() && strs[i].charAt(j)==s1.charAt(j)){
                s2+=s1.substring(j,j+1); 
                j++;
            }
            s1=s2;
        }
            return s1;
    }
}