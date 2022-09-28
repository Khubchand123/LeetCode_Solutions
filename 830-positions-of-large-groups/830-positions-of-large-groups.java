class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> obj = new ArrayList<>();
        int count=1;
        char c = s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            int l=i;
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
                while(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                    i++;
                    count++;
                }
                if(count>=3){
                    List<Integer> obj1 = new ArrayList<>();
                    obj1.add(l);
                    obj1.add(i);
                    obj.add(obj1);
                }
            }
            count=1;
            // c=s.charAt(i);
        }
        return obj;
    }
}