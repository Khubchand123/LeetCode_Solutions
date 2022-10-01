class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int mul=1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            ans+=((int)(columnTitle.charAt(i))-64)*mul;
            mul*=26;
        }
        return ans;
    }
}