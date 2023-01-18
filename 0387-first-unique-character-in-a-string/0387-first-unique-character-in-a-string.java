class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int findex = s.indexOf(c);
            int lindex = s.lastIndexOf(c);
            if(findex==lindex){
                ans=i;
                break;
            }
        }
        return ans;
    }
}