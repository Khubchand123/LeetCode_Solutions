class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rarr[] = new int[26];
        int marr[] = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            rarr[ransomNote.charAt(i)-97]++;
        }
        for(int i=0;i<magazine.length();i++){
            marr[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(rarr[i]>marr[i]){
                return false;
            }
        }
        return true;
    }
}