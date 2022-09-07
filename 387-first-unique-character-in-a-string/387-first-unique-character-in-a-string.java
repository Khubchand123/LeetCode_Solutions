class Solution {
    public int firstUniqChar(String s) {
        int k=-1;
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                k=i;
                break;
            }
        }
        return k;
    }
}