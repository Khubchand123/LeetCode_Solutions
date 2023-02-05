class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> obj = new ArrayList<>();
        int n=s.length();
        int k=p.length();
        int[] arr1 = new int[26];
        for(int i=0;i<k;i++){
            arr1[(int)p.charAt(i)-97]++;
        }
        for(int i=0;i<n-k+1;i++){
            String s1 = s.substring(i,i+k);
            int[] arr2 = new int[26];
            for(int j=0;j<k;j++){
                arr2[(int)s1.charAt(j)-97]++;
            }
            if(isAnagram(arr1,arr2)){
                obj.add(i);
            }
        }
        return obj;
    }
    public static boolean isAnagram(int[] arr1,int[] arr2) {
        
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
        
    }
}