class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[] {i,j};
//                 }
//             }
            
//         }
        
//         return null;
        
        int result[]=new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
        }
        return null;
    }
}