package algoritm.leetcode.grind1;

public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        image = paint(image,sr,sc,originalColor,color);

        return image ;

    }
    public int [][] paint(int[][] image, int sr,int sc,int originalColor,int color){
        // 인덱스 나가면 그냥 리턴
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return image;
        }

        // 인접 색깔 다르면  리턴?
        if( image[sr][sc]==color || image[sr][sc] !=originalColor ){
            return image;
        }else {
            image[sr][sc]=color;
        }

        image= paint(image ,sr-1,sc,originalColor,color);
        image=paint(image,sr,sc-1,originalColor,color);
        image=paint(image,sr+1,sc,originalColor,color);
        image=  paint(image,sr,sc+1,originalColor,color);


        return image;

    }
}
