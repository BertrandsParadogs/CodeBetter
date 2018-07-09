class Solution {
    
        private int[] xDir = new int[]{-1, 0, 1, 0};
        private int[] yDir = new int[]{0, -1, 0, 1};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor)
            dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    
    private void dfs(int[][] image, int x, int y, int oldPixel, int newColor) {
        if (x < 0 || x == image.length || y < 0 || y == image[0].length || image[x][y] != oldPixel) return;
        image[x][y] = newColor;
        for (int i = 0; i < xDir.length; i++)
            dfs(image, x+xDir[i], y+yDir[i], oldPixel, newColor);
    }
}