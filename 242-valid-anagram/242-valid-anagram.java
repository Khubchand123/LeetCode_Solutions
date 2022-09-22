class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
        // HashMap<Character,Integer> map = new HashMap<>();
        // boolean b=true;
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         int val=map.get(s.charAt(i));
        //         map.put(s.charAt(i),val+1);
        //     }
        //     else{
        //         map.put(s.charAt(i),1);
        //     }
        // }
        // for(int i=0;i<t.length();i++){
        //     if(map.containsKey(t.charAt(i))){
        //         int val=map.get(t.charAt(i));
        //         map.put(t.charAt(i),val+1);
        //     }
        //     else{
        //         map.put(t.charAt(i),1);
        //     }
        // }
        // for(char c:map.keySet()){
        //     int v=map.get(c);
        //     if(v%2!=0){
        //         return false;
        //     }
        // }
        // return true;
    }
}