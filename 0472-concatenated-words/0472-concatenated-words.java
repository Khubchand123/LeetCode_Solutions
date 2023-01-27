class Solution {
   
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            set.add(words[i]);
        }
        for(int i=0;i<words.length;i++){
            if(helper(set,words[i])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    boolean helper(Set<String> set,String s){
        for(int i=1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            if(set.contains(s1) && (set.contains(s2) || helper(set,s2))){
                return true;
            }
        }
        return false;
    }
}