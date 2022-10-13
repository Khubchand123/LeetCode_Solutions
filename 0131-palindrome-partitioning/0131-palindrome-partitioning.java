class Solution {
    
    public static void partitioning(String ques,List<String> obj,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(obj));
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s = ques.substring(0,cut);
            if(palindrome(s)){
                obj.add(s);
                partitioning(ques.substring(cut),obj,ans);
                obj.remove(obj.size()-1);
            }
        }
    }
    public static boolean palindrome(String s){
        int si=0;
        int li=s.length()-1;
        while(si<li){
            if(s.charAt(si)!=s.charAt(li)){
                return false;
            }
            si++;
            li--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> obj  = new ArrayList<>();
        partitioning(s,obj,ans);
        return ans;
    }
}