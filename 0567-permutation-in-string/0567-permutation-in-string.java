class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[(int)s1.charAt(i)-97]++;
        }
        // int arr2[] = new int[26];
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            if(arr1[(int)s2.charAt(i)-97]==0){
                continue;
            }
            String h = s2.substring(i,i+s1.length());
            int arr2[] = new int[26];
            for(int j=0;j<h.length();j++){
                arr2[(int)h.charAt(j)-97]++;
            }
            if(check(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
    public static boolean check(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}