class Solution {
    public String reverseWords(String s) {
        String s1=s.trim();
        String[] arr=s1.split(" ");
        String s2="";
        for(String q:arr){
            if(!q.equals("")){
                s2=q+" "+s2;
            }
        }
        return s2.substring(0,s2.length()-1);
    }
}