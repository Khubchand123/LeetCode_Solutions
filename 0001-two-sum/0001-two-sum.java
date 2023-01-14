class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int k = target-nums[i];
            if(map.containsKey(k)){
                arr[0] = map.get(k);
                arr[1] = i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}