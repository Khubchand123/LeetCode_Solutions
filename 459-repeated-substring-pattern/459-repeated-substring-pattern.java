class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1){
            return false;
        }
        String s1=s.substring(0,1);
        for(int i=1;i<s.length();i++){
           if(i+s1.length()>s.length()){
              return false;
           }
           else if(s.substring(i,i+s1.length()).equals(s1)){
                int j=i;
                while(i<s.length() && (i+s1.length()<=s.length())){
                    if(s.substring(i,i+s1.length()).equals(s1)){
                        i+=s1.length();
                    }
                    else{
                        
                       break;
                    }
                }
              if(i!=s.length()){
                 i=j;
                 s1+=s.substring(i,i+1);
              }
            }
            else{
                s1+=s.substring(i,i+1);
            }
        }
        if(s.length()==s1.length()){
            return false;
        }
        return true;
    }
}