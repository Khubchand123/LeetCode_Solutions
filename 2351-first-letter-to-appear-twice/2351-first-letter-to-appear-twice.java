class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char c='a';
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               c=s.charAt(i);
                break;
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        return c;
    }
}