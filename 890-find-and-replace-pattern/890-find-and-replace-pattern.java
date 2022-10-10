class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }
    
    boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
//         List<String> ans = new ArrayList<>();
//         pattern = countChar(pattern);
//         for(String word:words){
//             if(matchChar(pattern,countChar(word))){
//                 ans.add(word);
//             }
//         }
//         return ans;
        
//     }
    
//     public static String countChar(String s){
//         int k=1;
//         if(s.length()==1){
//             return s+"1";
//         }
//         String ans="";
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i)==s.charAt(i+1)){
//                 k++;
//             }
//             else{
//                 ans+=s.substring(i,i+1)+Integer.toString(k);
//                 k=1;
//             }
//         }
//         if(s.charAt(s.length()-2)==s.charAt(s.length()-1)){
//             ans+=s.substring(s.length()-1,s.length())+Integer.toString(k);
//         }
//         else{
//             ans+=s.substring(s.length()-1,s.length())+"1";
//         }
//         return ans;
//     }
//     public static boolean matchChar(String s1,String s2){
//         for(int i=1;i<s1.length();i+=2){
//             if(s1.charAt(i)!=s2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }
}