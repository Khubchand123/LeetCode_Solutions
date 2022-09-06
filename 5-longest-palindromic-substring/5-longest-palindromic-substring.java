class Solution {
    public String longestPalindrome(String s) {
        String s1="";
        
        for(int i=0;i<s.length();i++){
            if(s1.length()>=s.length()-i){
                break;
            }
            for(int j=s.length();j>i;j--){
                if(isPalindrome(s.substring(i,j))){
                    if(s.substring(i,j).length()>s1.length()){
                        s1=s.substring(i,j);
                        
                    }
                    break;
                }
            }
        }
        
        return s1;
    }
    
    public static boolean isPalindrome(String s){
        
        int i=0;
        int j=s.length()-1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}