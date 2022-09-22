class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        ans.add(obj);
        
        for(int i=1;i<numRows;i++){
            obj = new ArrayList<>();
            obj.add(1);
            int j=0;
            while(j<i-1){
                obj.add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));
                j++;
            }
            obj.add(1);
            ans.add(obj);
        }
        return ans;
    }
    
   
}