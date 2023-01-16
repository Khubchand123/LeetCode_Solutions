class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // Approach 1
        
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
        
        // Approach 2
        // List<List<Integer>> obj = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0;i<numRows;i++){
        //     ans.add(1);
        //     for(int j=i-1;j>0;j--){
        //         ans.set(j,ans.get(j)+ans.get(j-1));
        //     }
        //     obj.add(ans1);
        // }
        // return obj;
    }
    
   
}