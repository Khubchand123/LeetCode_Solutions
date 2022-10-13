class Solution {
    static int helper(int[] freq,String ans){
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                char ch1 =(char) (i + 'A');
                freq[i]--;
                count+=helper(freq,ans+ch1)+1;
                freq[i]++;
            }
        }
        return count;
    }
    public int numTilePossibilities(String tiles) {
       int[] ch = new int[26];
        for(int i=0;i<tiles.length();i++){
            ch[(tiles.charAt(i)-'A')]++;
        }
        return helper(ch,"");
    }
}