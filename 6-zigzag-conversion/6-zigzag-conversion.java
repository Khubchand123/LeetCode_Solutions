class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        String s1[]=new String[numRows];
        Arrays.fill(s1,"");
        int k=0,m=0;
        for(int i=0;i<s.length();i++){
            s1[k]+=s.substring(i,i+1);
            if(m==0 && k<numRows-1){
                k++;
            }
            else if(k==numRows-1){
                k--;
                m=1;
            }
            else if(m==1 && k>0){
                
                k--;
            }
            else{
                m=0;
                k++;
            }
        }
        String p="";
        for(int i=0;i<s1.length;i++){
            p+=s1[i];
        }
        return p;
    }
}