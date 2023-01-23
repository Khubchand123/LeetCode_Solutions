class Solution {
    // int count=0;
    
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> obj = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(i);
                    obj1.add(j);
                    obj.add(obj1);
                }
            }
        }
        int count1=0;
        while(obj.size()!=0){
            List<List<Integer>> temp = new ArrayList<>(obj);
            obj=new ArrayList<>();
            int count=0;
            while(temp.size()!=0){
                List<Integer> ans = temp.get(0);
                int i=ans.get(0);
                int j=ans.get(1);
                temp.remove(0);
                if(i+1<m && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(i+1);
                    obj1.add(j);
                    obj.add(obj1);
                    count++;
                }
                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(i-1);
                    obj1.add(j);
                    obj.add(obj1);
                    count++;
                }
                if(j+1<n && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(i);
                    obj1.add(j+1);
                    obj.add(obj1);
                    count++;
                }
                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(i);
                    obj1.add(j-1);
                    obj.add(obj1);
                    count++;
                }
            }
            if(count!=0){
                count1++;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return count1;
    }
    
}