class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                String s1=map.get(c);
                if(!(s1.equals(arr[i]))){
                    return false;
                }
            }
            else if(map.containsValue(arr[i])){
                return false;
            }
            else{
                map.put(c,arr[i]);
            }
        }
        return true;
    }
}