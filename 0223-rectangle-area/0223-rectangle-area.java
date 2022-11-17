class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int Area1=(ax1-ax2)*(ay1-ay2);
        Area1 = Area1<0?-1*Area1:Area1;
        int Area2=(bx1-bx2)*(by1-by2);
        Area2 = Area2<0?-1*Area2:Area2;
        int cArea=0;
        int x1=Math.max(ax1,bx1); 
        int x2=Math.min(ax2,bx2); 
        int y1=Math.max(ay1,by1);  
        int y2=Math.min(ay2,by2);  
        if(x2-x1<0 || y2-y1<0){
            
        }else{
            cArea=(x2-x1)*(y2-y1);
            cArea=cArea<0?-1*cArea:cArea;
        }
        return Area1+Area2-cArea;
    }
}