public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//         String s = Integer.toBinaryString(n);
// 		int count = 0;
// 		for (int i = 0; i < s.length(); i++) {
// 			if (s.charAt(i) == '1') {
// 				count++;
// 			}
// 		}

// 		return count;
        int count=0;
        int mask=1;
        int mul=2;
        for(int i=0;i<32;i++){
            if((n&mask)!=0){
                count++;
            }
            mask*=mul;
        }
        return count;
    }
}