class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i:nums1){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else{
                map1.put(i,1);
            }
        }
        List<Integer> obj = new ArrayList<>();
        for(int i:nums2){
            if(map1.containsKey(i)){
                obj.add(i);
                map1.put(i,map1.get(i)-1);
                if(map1.get(i)==0){
                    map1.remove(i);
                }
            }
        }
        int ans[] = new int[obj.size()];
        int j=0;
        for(int i:obj){
            ans[j++] = i;
        }
        return ans;
    }
}