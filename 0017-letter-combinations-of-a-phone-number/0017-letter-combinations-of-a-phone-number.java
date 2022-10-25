class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> obj = new ArrayList<>();
        keypad(obj,digits,0,map,"");
        return obj;
    }
  public static void keypad(List<String> obj,String s, int idx, HashMap<Character,String> map, String ans){
    if(idx == s.length()){
      obj.add(ans);
      return;
    }
    String str = map.get(s.charAt(idx));
    for(int i=0; i<str.length(); i++){
      ans += str.charAt(i);
      keypad(obj,s, idx+1, map, ans);
      ans = ans.substring(0,ans.length()-1);
    }
  }

}