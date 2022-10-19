class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> obj = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String s:words){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        while(k--!=0){
            obj.add(maxValue(map));
        }
        // Collections.sort(obj,Collections.reverseOrder());
        return obj;
    }
    public static String maxValue(Map<String,Integer> hm){
        String maxKey=null;
        List<String> obj1 = new ArrayList<>();
        for (String key : hm.keySet()) {
            if (maxKey == null || hm.get(key) > hm.get(maxKey)) {
                maxKey = key;
            }
        }
        int n=hm.get(maxKey);
        for (String key : hm.keySet()) {
            if (n==hm.get(key)) {
                obj1.add(key);
            }
        }
        Collections.sort(obj1);
        maxKey=obj1.get(0);
        hm.put(maxKey,-1);
        return maxKey;
    }
}