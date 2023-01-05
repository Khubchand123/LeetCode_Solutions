class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        int l = words[0].length();
        int total = n*l;
        List<Integer> obj = new ArrayList<>();
        
        for(int i=0;i<=s.length()-total;i++){
            Map<String,Integer> map = new HashMap<>();
            for(String word:words){
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }
                else{
                    map.put(word,1);
                }
            }
            String s1 = s.substring(i,total+i);
            for(int j=0;j<s1.length();j+=l){
                String s2=s1.substring(j,j+l);
                if(map.containsKey(s2)){
                    map.put(s2,map.get(s2)-1);
                    if(map.get(s2)==0){
                        map.remove(s2);
                    }
                }
                else{
                    break;
                }
            }
            if(map.size()==0){
                obj.add(i);
            }
            
        }
        return obj;
    }
}