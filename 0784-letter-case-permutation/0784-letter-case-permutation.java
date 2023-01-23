class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> obj = new ArrayList<>();
        helper(obj,s,"");
        return obj;
    }
    void helper(List<String> obj,String s,String ans){
        if(s.length()==0){
            obj.add(ans);
            return;
        }
        char c=s.charAt(0);
        helper(obj,s.substring(1),ans+c);
        if(c>='a' && c<='z'){
            helper(obj,s.substring(1),ans+(char)(c-32));
        }
        else if(c>='A' && c<='Z'){
            helper(obj,s.substring(1),ans+(char)(c+32));
        }
    }
}