class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> obj = new ArrayList<>();
        lexical(0,n,obj);
        obj.remove(0);
        return obj;
    }
    public static void lexical(int cur,int n,List<Integer> obj){
        if(cur>n){
            return;
        }
        obj.add(cur);
        int i=0;
        if(cur==0){
            i=1;
            for( ;i<=9;i++){
                lexical(cur*10+i,n,obj);
            }
        }
        else{
            for( ;i<=9;i++){
                lexical(cur*10+i,n,obj);
            }
        }
    }
}