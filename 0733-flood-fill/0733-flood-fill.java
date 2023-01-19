class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int scolor = image[sr][sc];
        if(scolor!=color){
            helper(image,sr,sc,color,scolor);
        }
        return image;
    }
    public static void helper(int[][] image, int sr, int sc, int color,int scolor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=scolor){
            return;
        }
        image[sr][sc] = color;
        helper(image,sr+1,sc,color,scolor);
        helper(image,sr-1,sc,color,scolor);
        helper(image,sr,sc+1,color,scolor);
        helper(image,sr,sc-1,color,scolor);
        
        
    }
}