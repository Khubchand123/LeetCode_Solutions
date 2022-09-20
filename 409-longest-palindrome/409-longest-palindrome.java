class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int a=map.get(s.charAt(i));
                map.put(s.charAt(i),a+1);
                if((a+1)%2==0){
                    count+=2;
                }
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        // if(count>0){
        //     count+=1;
        // }
        if(s.length()-count>0){
            count+=1;
        }
        return count;
    }
}