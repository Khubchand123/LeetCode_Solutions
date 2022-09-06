class Solution {
    public boolean areNumbersAscending(String s) {
        String[]  arr = s.split(" ");
        int p=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)>='0' && arr[i].charAt(0)<='9'){
                if(Integer.parseInt(arr[i])>p){
                    p=Integer.parseInt(arr[i]);
                }
                else{
                    return false;
                }
                
            }
        }
        return true;
    }
}