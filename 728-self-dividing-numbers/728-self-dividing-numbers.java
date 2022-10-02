class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> obj = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            List<Integer> temp = new ArrayList<>();
            int sign=0;
            while(num>0){
                // check is number contain any zero
                if(num%10==0){
                    sign=1;
                    break;
                }
                temp.add(num%10);
                num=num/10;
            }
            int sign1=0;
            if(sign==0){
                for(int j:temp){
                    // check is any number not divide i
                    if(i%j!=0){
                        sign1=1;
                        break;
                    }
                }
                if(sign1==0){
                    obj.add(i);
                }
            }
            
        }
        return obj;
    }
}