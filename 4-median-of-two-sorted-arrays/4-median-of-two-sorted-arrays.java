class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int total=n1+n2;
        int x=0;
        int i=0;
        int j=0;
        int num1=0;
        int num2=0;
        while(x<=total/2) {
            num2=num1;
			if(j==nums2.length && i!=nums1.length) {
				num1=nums1[i];
				i++;
				x++;
			}else if(i==nums1.length && j!=nums2.length) {
				num1=nums2[j];
				j++;
				x++;
			}else if(nums1[i]<nums2[j]) {
				num1=nums1[i];
				i++;
				x++;
			}else if(nums2[j]<nums1[i]) {
				num1=nums2[j];
				j++;
				x++;
			}else {
				num1=nums2[j];
				j++;
				x++;
                if(x>total/2){
                    break;
                }
                num2=num1;
				num1=nums1[i];
				i++;
				x++;
			}
		}
		if(total%2==0) {
			
			return (double)((double)num1+(double)num2)/2;
		}else {
			return (double)num1;
		}
	}
}