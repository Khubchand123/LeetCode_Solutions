class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int count=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && !map.containsKey(key.charAt(i))){
                // convert Ascii to character
                map.put(key.charAt(i),(char)(97+count)); 
                count++;
            }
        }
        String s1="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' '){
                char c=map.get(message.charAt(i));
                s1+=String.valueOf(c);
            }
            else{
                s1+=" ";
            }
        }
        return s1;
    }
}