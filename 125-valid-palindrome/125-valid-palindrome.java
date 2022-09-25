class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String s1="";
        String s2="";
        for(int i=0;i<n;i++){
            if((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                s1+=s.substring(i,i+1);
            }
            if((s.charAt(n-i-1)>='0' && s.charAt(n-i-1)<='9') || (s.charAt(n-i-1)>='a' && s.charAt(n-i-1)<='z')){
                s2+=s.substring(n-i-1,n-i);
            }
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}