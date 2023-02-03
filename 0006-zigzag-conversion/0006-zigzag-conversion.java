class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1){
           return s;
       }
       String arr[] = new String[numRows];
       Arrays.fill(arr,"");
       int k=0;  //index
       int m=0;  //diagonal
       for(int i=0;i<s.length();i++){
           arr[k]+=s.substring(i,i+1);
           if(m==0 && k<numRows-1){
               k++;
           }
           else if(k==numRows-1){
               m=1;
               k--;
           }
           else if(m==1 && k>0){
               k--;
           }
           else{
               k++;
               m=0;
           }
       }
       String ans = "";
       for(int i=0;i<numRows;i++){
           ans+=arr[i];
       }
       return ans;
    }
}