class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            int max=1;
            int prev=i-1;
            int next=i+1;
            while(set.contains(prev)){
                max++;
                set.remove(prev--);
            }
            while(set.contains(next)){
                max++;
                set.remove(next++);
            }
            ans=Math.max(max,ans);
        }
        return ans;
    }
}