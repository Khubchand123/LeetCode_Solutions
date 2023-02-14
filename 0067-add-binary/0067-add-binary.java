class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        String s = "";
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        while(n1>=0 || n2>=0){
            if(n1>=0 && a.charAt(n1)=='1'){
                c+=1;
            }
            if(n2>=0 && b.charAt(n2)=='1'){
                c+=1;
            }
            if(c==0 || c==1){
                s = c+s;
                c=0;
            }
            else if(c==2){
                s = 0+s;
                c=1;
            }
            else{
                s = 1+s;
                c=1;
            }
            n1--;
            n2--;
        }
        if(c>0){
            s=1+s;
        }
        return s;
    }
}