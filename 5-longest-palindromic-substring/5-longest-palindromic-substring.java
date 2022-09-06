class Solution {
    public String longestPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s1.length()>=s.length()-i){
                break;
            }
            for(int j=s.length();j>i;j--){
                if(check(s.substring(i,j))){
                    if(s.substring(i,j).length()>s1.length()){
                        s1=s.substring(i,j);
                        
                    }
                    break;
                }
            }
        }
        
        return s1;
        // int n = s.length();
        // int max_len = 0;
        // int starting_index = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         if (check(s, i, j)) {
        //             if (j - i + 1 > max_len) {
        //                 max_len = j - i + 1;
        //                 starting_index = i;
        //             }
        //         }
        //     }
        // }
        // return s.substring(starting_index, starting_index + max_len);
    }
    
    public static Boolean check(String s) {
        int i=0;
        int j=s.length()-1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
//     public static boolean isPalindrome(String s){
        
//         String s1="";
//         for(int k=0;k<s.length();k++){
//             s1=s.substring(k,k+1)+s1;
//         }
//         return s1.equals(s);
//     }
}