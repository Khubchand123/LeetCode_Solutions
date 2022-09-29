class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> obj = new ArrayList<>();
        int index=0;
        int max=abs(x,arr[0]);
        for(int i=1;i<arr.length;i++){
            if(abs(x,arr[i])<max){
                max=abs(x,arr[i]);
                index=i;
            }
        }
        obj.add(arr[index]);
        int left=index-1;
        int right=index+1;
        while(obj.size()!=k){
            if(left<0){
                obj.add(arr[right++]);
            }
            else if(right>=arr.length){
                obj.add(arr[left--]);
            }
            else{
                if(abs(x,arr[left])<=abs(x,arr[right])){
                    obj.add(arr[left--]);
                }
                else{
                    obj.add(arr[right++]);
                }
            }
        }
        Collections.sort(obj);
        return obj;
    }
    public static int abs(int a,int b){
        if(a<b){
            return b-a;
        }
        else{
            return a-b;
        }
    }
    
}