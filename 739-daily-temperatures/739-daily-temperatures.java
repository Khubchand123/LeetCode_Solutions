class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        // Approach 1 By using Stack
        
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int j=0;j<n;j++){
            while(!st.isEmpty() && temperatures[j]>temperatures[st.peek()]){
                ans[st.peek()]=j-st.peek();
                st.pop();
            }
            st.push(j);
        }
        return ans;
        
        
        // Approach 2 Bruth Force Algorithm
//         int n=temperatures.length;
//         int[] ans = new int[n];
//         for(int i=0;i<n-1;i++){
//             int count=0;
//             int p=0;
//             for(int j=i+1;j<n;j++){
//                 if(temperatures[j]>temperatures[i]){
//                     p=1;
//                     count++;
//                     break;
//                 }
//                 else{
//                     count++;
//                 }
                
//             }
//             if(p==1){
//                 ans[i]=count;
//             }
//             else{
//                 ans[i]=0;
//             }
//         }
//         ans[n-1]=0;
//         return ans;
    }
}