class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int h = heights[stack.pop()];
                int r = i;
                if(stack.isEmpty()){
                    maxArea = Math.max(maxArea,h*r);
                }
                else{
                    int l = stack.peek();
                    maxArea = Math.max(maxArea,h*(r-l-1));
                }
            }
            stack.push(i);
        }
        int r=heights.length;
        while(!stack.isEmpty()){
            int h = heights[stack.pop()];
            if(stack.isEmpty()){
                maxArea = Math.max(maxArea,h*r);
            }
            else{
                int l = stack.peek();
                maxArea = Math.max(maxArea,h*(r-l-1));
            }
        }
        return maxArea;
        
    }
    
}