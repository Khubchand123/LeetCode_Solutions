class Solution {
    public boolean halvesAreAlike(String s) {
        int c1 = 0;
        int c2 = 0;
        int n =s.length();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                if(i<n/2){
                    c1++;
                }
                else{
                    c2++;
                }
            }
        }
        return c1==c2;
    }
}