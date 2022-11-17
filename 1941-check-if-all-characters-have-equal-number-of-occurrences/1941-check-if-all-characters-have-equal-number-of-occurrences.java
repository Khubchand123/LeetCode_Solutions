class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int k=s.charAt(i)-97;
            arr[k]++;
        }
        int k=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                k=arr[i];
                break;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                
            }
            else if(k!=arr[i]){
                return false;
            }
        }
        return true;
    }
}