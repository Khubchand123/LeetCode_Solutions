class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ll=new ArrayList<>();
        if(s.length()<4 || s.length()>12){
            return ll;
        }
        findip(s,ll,"",0);
        return ll;
    }
    public static void findip(String s,List<String> ll,String ans,int dc){
        if(s.length()==0){
            if(dc==4){
                for(int i=0;i<ans.length()-2;i++){
                    if(ans.charAt(i)=='.' && ans.charAt(i+1)=='0' && ans.charAt(i+2)!='.'){
                        return;
                    }
                    
                }
                 if(ans.charAt(0)=='0' && ans.charAt(1)!='.'){
                     return;
                 }
                ll.add(ans.substring(0,ans.length()-1));
            }
            return;
        }
        if(dc>3){
            return;
        }
        findip(s.substring(1),ll,ans+s.charAt(0)+".",dc+1);
        if(s.length()>=2){

         findip(s.substring(2),ll,ans+s.substring(0,2)+".",dc+1);
        }
        if(s.length()>=3){
        int c=Integer.parseInt(s.substring(0,3));
        if(c<=255){
        findip(s.substring(3),ll,ans+s.substring(0,3)+".",dc+1);
        }
        }
    }
}


