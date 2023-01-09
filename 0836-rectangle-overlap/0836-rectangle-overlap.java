class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=Math.max(rec1[0],rec2[0]); 
        int x2=Math.min(rec1[2],rec2[2]); 
        int y1=Math.max(rec1[1],rec2[1]);  
        int y2=Math.min(rec1[3],rec2[3]);
        if(x2-x1<=0 || y2-y1<=0){
            return false;   
        }
        return true;
        // return (rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] &&  rec1[3] > rec2[1]);
    }
}