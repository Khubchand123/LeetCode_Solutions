class Solution {
    public char findTheDifference(String s, String t) {
        String concat = s+t;
        char c = concat.charAt(0);
        for(int i=1;i<concat.length();i++){
            c^=concat.charAt(i);
        }
        return c;
    }
}