class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(open(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char c1= stack.pop();
                if(!match(c1,c)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static boolean open(char c){
        return c=='(' || c=='[' || c=='{';
    }
    public static boolean match(char c1,char c2){
        return (c1=='(' && c2==')') || (c1=='[' && c2==']') || (c1=='{' && c2=='}');
    }
}