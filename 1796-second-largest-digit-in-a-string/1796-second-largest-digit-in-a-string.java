class Solution {
    public int secondHighest(String s) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int k=Integer.parseInt(s.substring(i,i+1));
                if(max1<k){
                    max1=k;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int k=Integer.parseInt(s.substring(i,i+1));
                if(max2<k && k!=max1){
                    max2=k;
                }
            }
        }
        return max2==Integer.MIN_VALUE?-1:max2;
    }
}