class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int k=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s=word.substring(i,i+1)+s;
                s+=word.substring(i+1,word.length());
                k=1;
                break;
            }
            else{
                s=word.substring(i,i+1)+s;
            }
        }
        if(k==1) return s;
        return word;
    }
}