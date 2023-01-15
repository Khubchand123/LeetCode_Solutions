class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        int c=0;
        for(int i:nums1){
            arr1[i]++;
        }
        for(int i:nums2){
            arr2[i]++;
        }
        
        for(int i=0;i<1001;i++){
            c+=Math.min(arr1[i],arr2[i]);
        }
        int ans[] = new int[c];
        int k=0;
        for(int i=0;i<1001;i++){
            int j=Math.min(arr1[i],arr2[i]);
            while(j-->0){
                ans[k++]=i;
            }
        }
        return ans;
        
    }
}