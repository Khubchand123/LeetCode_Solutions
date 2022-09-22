class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> obj = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(map.containsKey(temp)) {
                map.get(temp).add(s); 
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(temp, list);
            }
        }
        
        for(String s : map.keySet()) {
            obj.add(map.get(s));
        }
        return obj;
    }
}