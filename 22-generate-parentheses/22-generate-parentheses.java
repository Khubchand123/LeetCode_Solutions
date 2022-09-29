class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> obj = new  ArrayList<>();
        create(obj,n,0,0,"");
        return obj;
    }
    public static void create(List<String> obj,int n,int open,int close,String ans){
        if(open==n && close==n){
            obj.add(ans);
        }
            
        if(open<n){
            create(obj,n,open+1,close,ans+"(");
        }
        if(close<open){
            create(obj,n,open,close+1,ans+")");
        }
    }
}