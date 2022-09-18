class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> obj = new HashMap<>();
        
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        int[] arr1=new int[arr.length];
        Arrays.sort(arr2);
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(!obj.containsKey(arr2[i])){
                obj.put(arr2[i],count++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr1[i]=obj.get(arr[i]);
        }
        
        return arr1;
    }
}