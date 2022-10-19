class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits="123456789";
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;i+j<=9;j++){
                String s= digits.substring(j,j+i);
                int value = Integer.parseInt(s);
                if(value>=low && value<=high){
                    ans.add(value);
                }
            }
        }
        return ans;
        
    }
}