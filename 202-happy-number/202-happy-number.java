class Solution {
    public boolean isHappy(int n) {
        List<Integer> obj = new ArrayList<>();
        obj.add(n);
        while(n!=1){
            
            int temp=n;
            n=0;
            while(temp>0){
                int rem=temp%10;
                n+=rem*rem;
                temp=temp/10;
            }
            if(obj.contains(n)){
                return false;
            }
            else{
                obj.add(n);
            }
            
    
        }
        return true;
    }
}