class Solution {
    public String reverseWords(String s) {
        
        
           // Approach1:- Without using extra space
        
        String s1=s.trim();
        String s2="";
        String s3="";
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.substring(i,i+1).equals(" ")){
                if(s3.length()!=0){
                    s2=s3+" "+s2;
                }
                s3="";
            }
            else{
                s3+=s1.substring(i,i+1);
            }
        }
        String ans=s3+" "+s2;
        return ans.substring(0,ans.length()-1);
        
                // Approach2:-  With Using Extra Space
        
        // String s1=s.trim();
        // String[] arr=s1.split(" ");
        // String s2="";
        // for(String q:arr){
        //     if(!q.equals("")){
        //         s2=q+" "+s2;
        //     }
        // }
        // return s2.substring(0,s2.length()-1);
    }
}