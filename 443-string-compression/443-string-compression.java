class Solution {
    public int compress(char[] chars) {
        String s=new String(chars);
        s=compressString(s);
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
    public static String compressString(String s){
        String s2="";
        int c = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                 c++;
            }
            else{
                s2+=s.substring(i,i+1);
                if(c>1) s2+=String.valueOf(c);
                c=1;
            }
        }
        s2+=s.substring(s.length()-1,s.length());
        if(c>1)
        s2+=String.valueOf(c);
        return s2;
    }
}