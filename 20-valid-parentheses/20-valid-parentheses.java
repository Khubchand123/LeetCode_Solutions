class Solution {
    public boolean isOpening(char c){
        return (c=='(' || c=='{' || c=='[');
    }
    public boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(isOpening(cur)){
                s1.push(cur);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                else if(!isMatching(s1.peek(),cur)){
                    return false;
                }
                else{
                    s1.pop();
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}