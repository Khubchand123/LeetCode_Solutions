class Solution {
    public int maxPower(String s) {
        int max=0;
        int count=1;
        for(int i=0;i<s.length();i++){
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            max=Math.max(count,max);
            count=1;
        }
        return max;
    }
}