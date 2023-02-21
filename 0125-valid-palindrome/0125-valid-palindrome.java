class Solution {
    public boolean isPalindrome(String s) {
        // String s1="";
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(check(c1) && check(c2)){
                if(c1!=c2){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
            else if(!check(c1)){
                i++;
            }
            else if(!check(c2)){
                j--;
            }
        }
        return true;
    }
    public boolean check(char c){
        return (c>='a' && c<='z') || (c>='0' && c<='9');
    }
}