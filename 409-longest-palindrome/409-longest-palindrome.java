class Solution {
    public int longestPalindrome(String s) {
        
        // logic:- count the occurence of char which occurs even time in string 
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
        
        // after counting check is string cotain any single character which we can place in center of palindrome string
        if(s.length()-count>0){
            count+=1;
        }
        return count;
    }
}