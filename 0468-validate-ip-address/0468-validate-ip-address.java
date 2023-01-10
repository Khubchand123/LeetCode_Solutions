class Solution {
    public String validIPAddress(String queryIP) {
        int n = queryIP.length();
        for(int i=0;i<n;i++){
            if(queryIP.charAt(i)=='.'){
                return ipV4(queryIP);
            }
            else if(queryIP.charAt(i)==':'){
                return ipV6(queryIP);
            }
            else if(i>=4){
                break;
            }
        }
        return "Neither";
    }
    public static boolean check(String s1){
        if(s1.length()==0 || s1.length()>3){
            return false;
        }
        int k = Integer.parseInt(s1);
                    // used to check leading zeros
        String s2 = Integer.toString(k);
        if(s1.length()!=s2.length()){
            return false;
        }
        if(k>255){
            return false;
        }
        return true;
    }
    public static String ipV4(String s){
        int count=0;
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                s1+=s.charAt(i);
            }
            else if(s.charAt(i)=='.'){
                if(!check(s1)){
                    return "Neither";
                }
                s1="";
                count++;
            }
            else{
                return "Neither";
            }
        }
        if(check(s1) && count==3){
            return "IPv4";
        }
        else{
            return "Neither";
        }
    }
    public static String ipV6(String s){
        int count=0;
        String s1="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='0' && c<='9') || (c>='a' && c<='f') || (c>='A' && c<='F')){
                s1+=s.charAt(i);
            }
            else if(s.charAt(i)==':'){
                if(s1.length()<1 || s1.length()>4){
                    return "Neither";
                }
                s1="";
                count++;
            }
            else{
                return "Neither";
            }
        }
        if(s1.length()>=1 && s1.length()<=4 && count==7){
            return "IPv6";
        }
        else{
            return "Neither";
        }
    }
}